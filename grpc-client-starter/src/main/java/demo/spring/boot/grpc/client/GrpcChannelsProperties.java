package demo.spring.boot.grpc.client;

import java.util.HashMap;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.Map;

@ConfigurationProperties("grpc.client")
public class GrpcChannelsProperties {

    @NestedConfigurationProperty
    private Map<String, GrpcChannelProperties> channels = new HashMap<>();

    public GrpcChannelProperties getChannel(String name) {
        GrpcChannelProperties channel = channels.get(name);
        if (channel == null) {
            return GrpcChannelProperties.DEFAULT_CHANNEL;
        }
        return channel;
    }

    public Map<String, GrpcChannelProperties> getChannels() {
        return channels;
    }

    public void setChannels(Map<String, GrpcChannelProperties> channels) {
        this.channels = channels;
    }

    @Override
    public String toString() {
        return "GrpcChannelsProperties{" +
                "channels=" + channels +
                '}';
    }
}
