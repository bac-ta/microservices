package demo.spring.boot.grpc.client;

import io.grpc.ClientInterceptor;
import java.util.Collection;

public interface ClientInterceptorInitializer {

    Collection<ClientInterceptor> interceptors();
}
