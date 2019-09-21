package demo.service.framework.logging;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.Context;
import io.grpc.ForwardingClientCall;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import demo.service.framework.utils.Strings;
import org.springframework.web.context.request.RequestContextHolder;

import static demo.service.framework.logging.LoggingConstant.REQUEST_ID;
import static demo.service.framework.logging.LoggingConstant.REQUEST_ID_CONTEXT_KEY;
import static demo.service.framework.logging.LoggingConstant.REQUEST_ID_META_KEY;
import static org.springframework.web.context.request.RequestAttributes.SCOPE_REQUEST;

@Deprecated
public class GrpcClientLoggingInterceptor implements ClientInterceptor {

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
            CallOptions callOptions, Channel next) {

        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(
                next.newCall(method, callOptions)) {

            @Override public void start(Listener<RespT> responseListener, Metadata headers) {
                String requestId = getRequestIdFromRequestContext();
                if (Strings.isEmpty(requestId)) {
                    requestId = getRequestIdFromGrpcContext();
                }
                headers.put(REQUEST_ID_META_KEY, requestId);

                super.start(responseListener, headers);
            }
        };
    }

    private String getRequestIdFromRequestContext() {
        try {
            return (String) RequestContextHolder.getRequestAttributes()
                    .getAttribute(REQUEST_ID, SCOPE_REQUEST);
        } catch (Exception e) {
            // ignore
            return "";
        }
    }

    private String getRequestIdFromGrpcContext() {
        return REQUEST_ID_CONTEXT_KEY.get(Context.current());
    }

}
