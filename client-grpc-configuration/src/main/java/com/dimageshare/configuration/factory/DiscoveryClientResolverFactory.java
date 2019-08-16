package com.dimageshare.configuration.factory;

import com.dimageshare.configuration.resolver.DiscoveryClientNameResolver;
import io.grpc.Attributes;
import io.grpc.NameResolver;
import io.grpc.internal.GrpcUtil;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import javax.annotation.Nullable;
import java.net.URI;

public class DiscoveryClientResolverFactory extends NameResolver.Factory {
    private final DiscoveryClient client;

    public DiscoveryClientResolverFactory(DiscoveryClient client) {
        this.client = client;
    }

    @Nullable
    @Override
    public NameResolver newNameResolver(URI targetUri, Attributes params) {
        return new DiscoveryClientNameResolver(targetUri.toString(),
                client,
                GrpcUtil.TIMER_SERVICE,
                GrpcUtil.SHARED_CHANNEL_EXECUTOR);
    }

    @Override
    public String getDefaultScheme() {
        return "spring";
    }
}
