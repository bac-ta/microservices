package demo.service.framework.logging;

import io.grpc.Context;
import io.grpc.Contexts;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import java.util.UUID;
import demo.service.framework.utils.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static demo.service.framework.logging.LoggingConstant.REQUEST_ID_CONTEXT_KEY;
import static demo.service.framework.logging.LoggingConstant.REQUEST_ID_META_KEY;

@Deprecated
public class GenRequestIdGrpcServerInterceptor implements ServerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(GenRequestIdGrpcServerInterceptor.class);

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {

        String method = call.getMethodDescriptor().getFullMethodName();
        String requestId = headers.get(REQUEST_ID_META_KEY);

        if (Strings.isEmpty(requestId)) {
            requestId = UUID.randomUUID().toString();
            headers.put(REQUEST_ID_META_KEY, requestId);
            LOGGER.debug("method: {}, generated request_id: {}", method, requestId);
        }

        LOGGER.debug("method: {}, request_id: {}", method, requestId);

        Context context = Context.current().withValue(REQUEST_ID_CONTEXT_KEY, requestId);

        return Contexts.interceptCall(context, call, headers, next);
    }
}
