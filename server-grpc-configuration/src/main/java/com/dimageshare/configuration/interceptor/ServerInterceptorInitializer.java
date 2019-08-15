package com.dimageshare.configuration.interceptor;

import io.grpc.ServerInterceptor;

import java.util.Collection;

public interface ServerInterceptorInitializer {
    Collection<ServerInterceptor> interceptors();
}
