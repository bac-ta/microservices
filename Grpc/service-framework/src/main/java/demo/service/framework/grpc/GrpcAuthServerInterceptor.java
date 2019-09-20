package demo.service.framework.grpc;

import io.grpc.Context;
import io.grpc.Contexts;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import javax.crypto.Cipher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrpcAuthServerInterceptor implements ServerInterceptor {

    // Logger
    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(GrpcAuthServerInterceptor.class);

    // Variables
    // ------------------------------------------------------------------------
    private Cipher descrypter;

    private String key;

    // Override methods
    // ------------------------------------------------------------------------
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {

        String token = headers.get(GrpcGlobals.AUTH_TOKEN_METADATA);

        return Contexts.interceptCall(Context.current(), call, headers, next);
    }

    // Private methods
    // ------------------------------------------------------------------------
    private String decrypt(String value) {
        return "test";
    }
}
