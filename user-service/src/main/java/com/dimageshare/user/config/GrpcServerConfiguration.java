package com.dimageshare.user.config;

import com.dimageshare.configuration.interceptor.ServerInterceptorInitializer;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServerConfiguration {
    @Bean
    public ServerInterceptorInitializer globalServerInterceptorInitializer() {
        return () -> Lists.newArrayList(
                new GrpcServerLoggingInterceptor(),
                new ErrorHandlingInterceptor());
    }
}
