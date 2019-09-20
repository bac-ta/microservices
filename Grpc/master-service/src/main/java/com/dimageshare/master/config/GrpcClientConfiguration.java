package com.dimageshare.master.config;

import com.google.common.collect.Lists;
import demo.service.framework.grpc.GrpcHeaderClientInterceptor;
import demo.spring.boot.grpc.client.ClientInterceptorInitializer;
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
