package com.dimageshare.configuration.interceptor;

import io.grpc.ClientInterceptor;

import java.util.Collection;

/**
 * @author bac-ta
 * <p>
 * This interface create method interceptor for client
 */
public interface ClientInterceptorInitializer {

    Collection<ClientInterceptor> interceptors();
}
