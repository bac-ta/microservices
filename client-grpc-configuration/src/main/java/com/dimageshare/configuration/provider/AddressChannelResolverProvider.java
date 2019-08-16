package com.dimageshare.configuration.provider;

import com.dimageshare.configuration.property.GrpcChannelsProperties;
import com.dimageshare.configuration.resolver.AddressChannelNameResolver;
import io.grpc.Attributes;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;
import io.grpc.internal.GrpcUtil;
import java.net.URI;
import javax.annotation.Nullable;

public class AddressChannelResolverProvider extends NameResolverProvider {

    private final GrpcChannelsProperties properties;

    public AddressChannelResolverProvider(GrpcChannelsProperties properties) {
        this.properties = properties;
    }

    @Override protected boolean isAvailable() {
        return true;
    }

    @Override protected int priority() {
        return 5;
    }

    @Nullable @Override public NameResolver newNameResolver(URI uri, Attributes attributes) {
        return new AddressChannelNameResolver(uri.toString(), properties.getChannel(uri.toString()), attributes,
                GrpcUtil.SHARED_CHANNEL_EXECUTOR);
    }

    @Override public String getDefaultScheme() {
        return "address";
    }
}
