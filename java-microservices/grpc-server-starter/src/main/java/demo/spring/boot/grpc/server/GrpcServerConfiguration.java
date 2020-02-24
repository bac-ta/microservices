package demo.spring.boot.grpc.server;

import io.grpc.Server;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConditionalOnClass({Server.class, GrpcServerFactory.class})
public class GrpcServerConfiguration {

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
        for (GrpcServiceDefinition definition: discover.findGrpcServices()) {
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
