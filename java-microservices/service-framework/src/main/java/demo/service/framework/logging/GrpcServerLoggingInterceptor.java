package demo.service.framework.logging;

import demo.service.framework.security.model.RequestInfo;
import io.grpc.ForwardingServerCallListener.SimpleForwardingServerCallListener;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.health.v1.HealthGrpc;
import demo.service.framework.grpc.GrpcGlobals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrpcServerLoggingInterceptor implements ServerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(GrpcServerLoggingInterceptor.class);

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {

        // check request health check
        if (call.getMethodDescriptor().getFullMethodName().equals(HealthGrpc.getCheckMethod().getFullMethodName())) {
            // ignored health check
            return next.startCall(call, headers);
        }
        final String method = call.getMethodDescriptor().getFullMethodName();
        final RequestInfo requestInfo = headers.get(GrpcGlobals.REQUEST_INFO_METADATA);
        final String requestId = requestInfo == null ? "empty" : requestInfo.getRequestId();

//        ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT> wrapper =
//                new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {
//
//            @Override public void request(int numMessages) {
//                LOGGER.info("[{}] request. method: {}, message: {{}}",
//                        requestId,
//                        method,
//                        Strings.inline(call.getAttributes()));
//                super.request(numMessages);
//            }
//
//            @Override public void sendMessage(RespT message) {
//                LOGGER.info("[{}] response. method: {}, message: {{}}",
//                        requestId,
//                        method,
//                        Strings.inline(message));
//                super.sendMessage(message);
//            }
//
//            @Override public void close(Status status, Metadata trailers) {
//                super.close(status, trailers);
//            }
//        };

        return new SimpleForwardingServerCallListener<ReqT>(next.startCall(call, headers)) {
            @Override public void onMessage(ReqT message) {
                final RequestInfo requestInfo = headers.get(GrpcGlobals.REQUEST_INFO_METADATA);
                LOGGER.info("[{}] RPC called. method: {}",
                        requestInfo != null ? requestInfo.getRequestId() : "empty",
                        method);
                super.onMessage(message);
            }
        };
    }
}
