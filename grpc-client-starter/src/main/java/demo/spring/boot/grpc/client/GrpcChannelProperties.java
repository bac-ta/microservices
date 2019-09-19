package demo.spring.boot.grpc.client;

import java.util.ArrayList;
import java.util.List;

public class GrpcChannelProperties {

    static final GrpcChannelProperties DEFAULT_CHANNEL = new GrpcChannelProperties();

    private List<String> hosts = new ArrayList<>();
    private List<Integer> ports = new ArrayList<>();

    private boolean plaintext = true;

    private boolean enableKeepAlive = false;
    private boolean keepAliveWithoutCalls = false;
    private long keepAliveTime = 180;
    private long keepAliveTimeout = 20;


    public GrpcChannelProperties() {
    }

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public List<Integer> getPorts() {
        return ports;
    }

    public void setPorts(List<Integer> ports) {
        this.ports = ports;
    }

    public boolean isPlaintext() {
        return plaintext;
    }

    public void setPlaintext(boolean plaintext) {
        this.plaintext = plaintext;
    }

    public boolean isEnableKeepAlive() {
        return enableKeepAlive;
    }

    public void setEnableKeepAlive(boolean enableKeepAlive) {
        this.enableKeepAlive = enableKeepAlive;
    }

    public boolean isKeepAliveWithoutCalls() {
        return keepAliveWithoutCalls;
    }

    public void setKeepAliveWithoutCalls(boolean keepAliveWithoutCalls) {
        this.keepAliveWithoutCalls = keepAliveWithoutCalls;
    }

    public long getKeepAliveTime() {
        return keepAliveTime;
    }

    public void setKeepAliveTime(long keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    public long getKeepAliveTimeout() {
        return keepAliveTimeout;
    }

    public void setKeepAliveTimeout(long keepAliveTimeout) {
        this.keepAliveTimeout = keepAliveTimeout;
    }
}
