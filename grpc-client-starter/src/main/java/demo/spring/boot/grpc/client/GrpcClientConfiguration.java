package demo.spring.boot.grpc.client;

import io.grpc.Channel;

import io.grpc.LoadBalancer;
import io.grpc.util.RoundRobinLoadBalancerFactory;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConditionalOnClass({Channel.class})
public class GrpcClientConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public GrpcChannelsProperties grpcChannelsProperties() {
        return new GrpcChannelsProperties();
    }

    @Bean
    public ClientInterceptorContext globalClientInterceptorContext() {
        return new ClientInterceptorContext();
    }

    @ConditionalOnMissingBean
    @Bean
    public LoadBalancer.Factory grpcLoadBalancerFactory() {
        return RoundRobinLoadBalancerFactory.getInstance();
    }

    @ConditionalOnMissingBean(value = GrpcChannelFactory.class, type = "org.springframework.cloud.client.discovery.DiscoveryClient")
    @Bean
    public GrpcChannelFactory addressChannelFactory(
            GrpcChannelsProperties properties,
            LoadBalancer.Factory loadBalancerFactory,
            ClientInterceptorContext interceptorContext) {
        return new AddressChannelFactory(properties, loadBalancerFactory, interceptorContext);
    }

    @ConditionalOnClass(GrpcClient.class)
    @Bean
    public GrpcClientCreator grpcClientBeanPostProcessor() {
        return new GrpcClientCreator();
    }

    @Configuration
    @ConditionalOnBean(DiscoveryClient.class)
    protected static class DiscoveryGrpcClientAutoConfiguration {

        @ConditionalOnMissingBean
        @Bean
        public GrpcChannelFactory discoveryClientChannelFactory(
                GrpcChannelsProperties properties,
                DiscoveryClient discoveryClient,
                LoadBalancer.Factory loadBalancerFactory,
                ClientInterceptorContext globalClientInterceptorRegistry) {
            return new DiscoveryClientChannelProvider(properties, discoveryClient, loadBalancerFactory, globalClientInterceptorRegistry);
        }
    }

}
