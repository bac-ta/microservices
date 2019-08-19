package com.dimageshare.user.config;

import com.dimageshare.configuration.interceptor.ClientInterceptorInitializer;
import com.dimageshare.frameworkhandler.grpc.GrpcHeaderClientInterceptor;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfiguration {

    @Bean
    public ClientInterceptorInitializer globalClientInterceptorInitializer() {
        return () -> Lists.newArrayList(
                new GrpcHeaderClientInterceptor());
    }
}