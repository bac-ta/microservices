package com.dimageshare.configuration.provider;

import com.dimageshare.configuration.factory.GrpcChannelFactory;
import com.dimageshare.configuration.factory.DiscoveryClientResolverFactory;
import com.dimageshare.configuration.interceptor.ClientInterceptorContext;
import com.dimageshare.configuration.property.GrpcChannelProperties;
import com.dimageshare.configuration.property.GrpcChannelPropertiesDo;
import io.grpc.Channel;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import io.grpc.LoadBalancer;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.cloud.client.discovery.DiscoveryClient;

public class DiscoveryClientChannelProvider implements GrpcChannelFactory {
    private final GrpcChannelPropertiesDo channels;
    private final DiscoveryClient client;
    private final LoadBalancer.Factory loadBalancerFactory;
    private final ClientInterceptorContext interceptorContext;

    public DiscoveryClientChannelProvider(
            GrpcChannelPropertiesDo channels,
            DiscoveryClient client,
            LoadBalancer.Factory loadBalancerFactory,
            ClientInterceptorContext interceptorContext) {
        this.channels = channels;
        this.client = client;
        this.loadBalancerFactory = loadBalancerFactory;
        this.interceptorContext = interceptorContext;
    }

    @Override public Channel createChannel(String name, List<ClientInterceptor> interceptors) {
        GrpcChannelProperties channelProperties = channels.getChannel(name);
        Channel channel = ManagedChannelBuilder.forTarget(name)
                .loadBalancerFactory(loadBalancerFactory)
                .nameResolverFactory(new DiscoveryClientResolverFactory(client))
                .usePlaintext(channelProperties.isPlaintext()).build();
        return ClientInterceptors.intercept(channel, createInterceptors(interceptors));
    }

    private List<ClientInterceptor> createInterceptors(List<ClientInterceptor> interceptors) {
        Collection<ClientInterceptor> globalInterceptors =
                interceptorContext.getClientInterceptors();
        List<ClientInterceptor> allInterceptors = new ArrayList<>();
        allInterceptors.addAll(globalInterceptors);
        allInterceptors.addAll(interceptors);
        return allInterceptors;
    }
}
