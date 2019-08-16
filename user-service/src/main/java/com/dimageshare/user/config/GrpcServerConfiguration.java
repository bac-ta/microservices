package com.dimageshare.user.config;

import com.google.common.collect.Lists;
import demo.spring.boot.grpc.server.ServerInterceptorInitializer;
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
