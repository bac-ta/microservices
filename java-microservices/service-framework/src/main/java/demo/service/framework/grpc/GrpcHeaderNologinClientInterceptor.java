package demo.service.framework.grpc;

import demo.service.framework.security.model.RequestInfo;
import io.grpc.*;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("Duplicates")
public class GrpcHeaderNologinClientInterceptor implements ClientInterceptor {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(GrpcHeaderNologinClientInterceptor.class);

    // Overrided methods
    // ------------------------------------------------------------------------
    @Override public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
            CallOptions call, Channel channel) {

        return new SimpleForwardingClientCall<ReqT, RespT>(channel.newCall(method, call)) {
            @Override public void start(Listener<RespT> responseListener, Metadata headers) {

                // リクエスト情報の転送
                RequestInfo requestInfo = GrpcGlobals.REQUEST_INFO.get(Context.current());
                if (requestInfo != null) {
                    headers.put(GrpcGlobals.REQUEST_INFO_METADATA, requestInfo);
                }

                super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {

                    @Override public void onMessage(RespT message) {
                        if (logger.isInfoEnabled()) {
                            logger.info("RPC request. method: {}", method.getFullMethodName());
                        }
                        super.onMessage(message);
                    }

                    @Override public void onHeaders(Metadata headers) {
                        super.onHeaders(headers);
                    }

                }, headers);
            }
        };
    }
}
