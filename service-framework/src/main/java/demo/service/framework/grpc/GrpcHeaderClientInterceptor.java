package demo.service.framework.grpc;

import demo.service.framework.security.model.RequestInfo;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.Context;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.ForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("Duplicates")
public class GrpcHeaderClientInterceptor implements ClientInterceptor {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(GrpcHeaderClientInterceptor.class);

    // Overrided methods
    // ------------------------------------------------------------------------
    @Override public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
            CallOptions call, Channel channel) {

        return new SimpleForwardingClientCall<ReqT, RespT>(channel.newCall(method, call)) {
            @Override public void start(ClientCall.Listener<RespT> responseListener, Metadata headers) {

                String loginInfo = GrpcGlobals.LOGIN_INFO.get(Context.current());

                if (loginInfo == null) {
                    loginInfo = "user";
                }

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
