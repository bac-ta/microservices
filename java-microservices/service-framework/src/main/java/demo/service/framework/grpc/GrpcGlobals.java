package demo.service.framework.grpc;

import demo.service.framework.security.model.RequestInfo;
import demo.service.framework.utils.concurrent.CurrentThreadExceutor;
import io.grpc.Context;
import io.grpc.Metadata;

import java.util.concurrent.Executor;

public final class GrpcGlobals {

    // gRPC Custom Header Key
    // ------------------------------------------------------------------------
    public static final Context.Key<String> LOGIN_INFO = Context.key("demo.authorize");
//    public static final Metadata.Key<String> LOGIN_INFO_METADATA = Metadata.Key.of("demo.authorize-bin",
//            new LoginInfoMarshaller());
    public static final Metadata.Key<String> AUTH_TOKEN_METADATA = Metadata.Key.of("demo.auth.token",
            Metadata.ASCII_STRING_MARSHALLER);
    public static final Context.Key<RequestInfo> REQUEST_INFO = Context.key("demo.request");
    public static final Metadata.Key<RequestInfo> REQUEST_INFO_METADATA = Metadata.Key.of("demo.request-bin",
            new RequestInfoMarshaller());

    // Constructor
    // ------------------------------------------------------------------------
    private GrpcGlobals() {}

    private static class RequestInfoMarshaller implements Metadata.BinaryMarshaller<RequestInfo> {
        @Override public byte[] toBytes(RequestInfo value) {
            return value.toBytes();
        }

        @Override public RequestInfo parseBytes(byte[] serialized) {
            return RequestInfo.newRequestInfo(serialized);
        }
    }

    // Executor
    // ------------------------------------------------------------------------
    public static Executor currentThreadContextExecutor() {
        return Context.currentContextExecutor(new CurrentThreadExceutor());
    }
}
