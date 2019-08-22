package com.dimageshare.master.configuration;

import com.dimageshare.configuration.interceptor.ServerInterceptorInitializer;
import com.dimageshare.frameworkhandler.grpc.ErrorHandlingInterceptor;
import com.dimageshare.frameworkhandler.logging.GrpcServerLoggingInterceptor;
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
