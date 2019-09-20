package demo.service.framework.grpc;

import demo.service.framework.security.model.RequestInfo;
import io.grpc.ForwardingServerCallListener.SimpleForwardingServerCallListener;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorHandlingInterceptor implements ServerInterceptor {

    private Logger logger = LoggerFactory.getLogger(ErrorHandlingInterceptor.class);

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers, ServerCallHandler<ReqT, RespT> next) {

        final RequestInfo requestInfo = headers.get(GrpcGlobals.REQUEST_INFO_METADATA);

        return new SimpleForwardingServerCallListener<ReqT>(next.startCall(call, headers)) {
            @Override public void onHalfClose() {
                try {
                    super.onHalfClose();
                } catch (Exception e) {
                    if (requestInfo != null) {
                        logger.warn("[{}] Server exception: uri={} referer={} exception={} message={} stacktrace={}",
                                requestInfo.getRequestId(),
                                requestInfo.getRequestUri(),
                                requestInfo.getReferer(),
                                e.getClass().getName(),
                                e.getMessage(),
                                getStackTraceAsString(e));
                    } else {
                        logger.warn("[{}] Server exception: uri={} referer={} exception={} message={} stacktrace={}",
                                "empty",
                                "empty",
                                "empty",
                                e.getClass().getName(),
                                e.getMessage(),
                                getStackTraceAsString(e));
                    }
                    if (e instanceof StatusRuntimeException) {
                        StatusRuntimeException sre = (StatusRuntimeException) e;
                        call.close(sre.getStatus(), sre.getTrailers());
                    } else {
                        call.close(Status.UNKNOWN.withDescription("Unknown error"), new Metadata());
                    }
                }
            }
        };
    }

    private String getStackTraceAsString(Throwable e) {
        StringBuffer buf = new StringBuffer();
        for (StackTraceElement ste : e.getStackTrace()) {
            buf.append(ste.toString());
            buf.append("/");
        }

        return buf.toString();
    }
}
