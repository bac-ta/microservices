package demo.service.framework.grpc;

import demo.service.framework.security.model.RequestInfo;
import io.grpc.Context;
import io.grpc.Contexts;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrpcHeaderServerInterceptor implements ServerInterceptor {

    // Logger
    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(GrpcHeaderServerInterceptor.class);

    // Overrided methods
    // ------------------------------------------------------------------------
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
                                                                 ServerCallHandler<ReqT, RespT> next) {

        // Request info
        RequestInfo requestInfo = headers.get(GrpcGlobals.REQUEST_INFO_METADATA);
        Context context = Context.current();
        if (requestInfo != null) {
            context = context.withValue(GrpcGlobals.REQUEST_INFO, requestInfo);
        }
        String loginInfo = "user";
        context = context.withValue(GrpcGlobals.LOGIN_INFO, loginInfo);

        if (requestInfo != null) {
            return Contexts.interceptCall(context, call, headers, next);
        }

        return next.startCall(call, headers);
    }
}
