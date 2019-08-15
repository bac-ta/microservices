package com.dimageshare.configuration;

import com.dimageshare.configuration.finder.GrpcServerDefinition;
import com.dimageshare.configuration.factory.DefaultGrpcServerFactory;
import com.dimageshare.configuration.finder.DefaultGrpcServiceFinder;
import com.dimageshare.configuration.finder.GrpcServiceFinder;
import com.dimageshare.configuration.interceptor.ServerInterceptorContext;
import com.dimageshare.configuration.factory.GrpcServerFactory;
import com.dimageshare.configuration.lifecycle.GrpcServerLifecycle;
import com.dimageshare.configuration.properties.GrpcServerProperties;
import io.grpc.Server;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConditionalOnClass({Server.class, GrpcServerFactory.class})
public class ServerGrpcConfigurationApplication {

    @ConditionalOnMissingBean
    @Bean
    public GrpcServerProperties grpcServerProperties() {
        return new GrpcServerProperties();
    }

    @Bean
    public ServerInterceptorContext globalServerInterceptorContext() {
        return new ServerInterceptorContext();
    }

    @ConditionalOnMissingBean
    @Bean
    public GrpcServiceFinder defaultGrpcServiceFinder() {
        return new DefaultGrpcServiceFinder();
    }

    @ConditionalOnMissingBean
    @Bean
    public GrpcServerFactory defaultGrpcServerFactory(GrpcServerProperties properties,
                                                      GrpcServiceFinder discover) {
        DefaultGrpcServerFactory factory = new DefaultGrpcServerFactory(properties);
        for (GrpcServerDefinition definition: discover.findGrpcServices()) {
            factory.addService(definition);
        }
        return factory;
    }

    @ConditionalOnMissingBean
    @Bean
    public GrpcServerLifecycle grpcServerLifecycle(GrpcServerFactory factory) {
        return new GrpcServerLifecycle(factory);
    }

}
