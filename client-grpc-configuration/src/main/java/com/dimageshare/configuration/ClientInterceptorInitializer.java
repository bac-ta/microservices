package com.dimageshare.configuration;

import io.grpc.ClientInterceptor;
import java.util.Collection;

public interface ClientInterceptorInitializer {

    Collection<ClientInterceptor> interceptors();
}
