package demo.spring.boot.grpc.client;

import io.grpc.Channel;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import io.grpc.LoadBalancer;
import io.grpc.NameResolver;
import io.grpc.netty.NettyChannelBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AddressChannelFactory implements GrpcChannelFactory {

    private final GrpcChannelsProperties properties;
    private final LoadBalancer.Factory loadBalancerFactory;
    private final NameResolver.Factory nameResolverFactory;
    private final ClientInterceptorContext interceptorContext;

    public AddressChannelFactory(GrpcChannelsProperties properties,
            LoadBalancer.Factory loadBalancerFactory,
            ClientInterceptorContext interceptorContext) {

        this.properties = properties;
        this.loadBalancerFactory = loadBalancerFactory;
        this.interceptorContext = interceptorContext;
        this.nameResolverFactory = new AddressChannelResolverProvider(properties);
    }

    @Override public Channel createChannel(String name, List<ClientInterceptor> interceptors) {
        GrpcChannelProperties channelProperties = properties.getChannel(name);
        NettyChannelBuilder builder = NettyChannelBuilder.forTarget(name)
                .loadBalancerFactory(loadBalancerFactory)
                .nameResolverFactory(nameResolverFactory)
                .usePlaintext(channelProperties.isPlaintext());

        if (channelProperties.isEnableKeepAlive()) {
            builder.keepAliveWithoutCalls(channelProperties.isKeepAliveWithoutCalls())
                    .keepAliveTime(channelProperties.getKeepAliveTime(), TimeUnit.SECONDS)
                    .keepAliveTimeout(channelProperties.getKeepAliveTimeout(), TimeUnit.SECONDS);
        }

        Channel channel = builder.build();

        Collection<ClientInterceptor> globalInterceptors = interceptorContext.getClientInterceptors();
        Set<ClientInterceptor> interceptorSet = new HashSet<>();
        if (globalInterceptors != null && !globalInterceptors.isEmpty()) {
            interceptorSet.addAll(globalInterceptors);
        }
        if (interceptors != null && !interceptors.isEmpty()) {
            interceptorSet.addAll(interceptors);
        }

        return ClientInterceptors.intercept(channel, new ArrayList<>(interceptorSet));
    }
}
