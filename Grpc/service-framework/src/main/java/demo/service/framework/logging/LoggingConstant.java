package demo.service.framework.logging;

import io.grpc.Context;
import io.grpc.Metadata;

public final class LoggingConstant {

    public static final String REQUEST_ID = "X-REQUEST-ID";

    public static final Context.Key<String> REQUEST_ID_CONTEXT_KEY = Context.key(REQUEST_ID);

    public static final Metadata.Key<String> REQUEST_ID_META_KEY = Metadata.Key.of(REQUEST_ID,
            Metadata.ASCII_STRING_MARSHALLER);
}
