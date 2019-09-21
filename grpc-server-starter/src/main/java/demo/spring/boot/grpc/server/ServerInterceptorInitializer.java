package demo.spring.boot.grpc.server;

import io.grpc.ServerInterceptor;
import java.util.Collection;

public interface ServerInterceptorInitializer {

    Collection<ServerInterceptor> interceptors();
}
