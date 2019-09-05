package com.dimageshare.configuration;

import com.dimageshare.configuration.factory.AddressChannelFactory;
import com.dimageshare.configuration.factory.GrpcChannelFactory;
import com.dimageshare.configuration.interceptor.ClientInterceptorContext;
import com.dimageshare.configuration.interceptor.GrpcClient;
import com.dimageshare.configuration.processor.GrpcClientProcessor;
import com.dimageshare.configuration.property.GrpcChannelPropertiesDo;
import com.dimageshare.configuration.provider.DiscoveryClientChannelProvider;
import io.grpc.Channel;

import io.grpc.LoadBalancer;
import io.grpc.util.RoundRobinLoadBalancerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bac-ta
 */
@Configuration
@EnableConfigurationProperties
@ConditionalOnClass({Channel.class})
public class GrpcClientConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public GrpcChannelPropertiesDo grpcChannelsProperties() {
        return new GrpcChannelPropertiesDo();
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
            GrpcChannelPropertiesDo properties,
            LoadBalancer.Factory loadBalancerFactory,
            ClientInterceptorContext interceptorContext) {
        return new AddressChannelFactory(properties, loadBalancerFactory, interceptorContext);
    }

    @ConditionalOnClass(GrpcClient.class)
    @Bean
    public GrpcClientProcessor grpcClientBeanPostProcessor() {
        return new GrpcClientProcessor();
    }

    @Configuration
    @ConditionalOnBean(DiscoveryClient.class)
    protected static class DiscoveryGrpcClientAutoConfiguration {

        @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
        @ConditionalOnMissingBean
        @Bean
        public GrpcChannelFactory discoveryClientChannelFactory(
                GrpcChannelPropertiesDo properties,
                DiscoveryClient discoveryClient,
                LoadBalancer.Factory loadBalancerFactory,
                ClientInterceptorContext globalClientInterceptorRegistry) {
            return new DiscoveryClientChannelProvider(properties, discoveryClient, loadBalancerFactory, globalClientInterceptorRegistry);
        }
    }

}
