package demo.service.framework.grpc;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall;
import io.grpc.ForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("Duplicates")
public class GrpcAuthClientInterceptor implements ClientInterceptor {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(GrpcAuthClientInterceptor.class);

    // Overrided methods
    // ------------------------------------------------------------------------
    @Override public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
            CallOptions callOptions, Channel channel) {

        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(channel.newCall(method, callOptions)) {

            @Override
            public void start(ClientCall.Listener<RespT> responseListener, Metadata headers) {
                // Custom header
                headers.put(GrpcGlobals.AUTH_TOKEN_METADATA, encrypt());

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

    // Overrided methods
    // ------------------------------------------------------------------------
    private String encrypt() {
        return "test";
    }
}
