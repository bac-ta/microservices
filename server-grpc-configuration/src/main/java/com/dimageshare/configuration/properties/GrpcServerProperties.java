package com.dimageshare.configuration.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties("grpc.server")
public class GrpcServerProperties {

    public static class Security {

        private Boolean enabled = false;

        private String certificateChainPath = "";

        private String certificatePath = "";

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public String getCertificateChainPath() {
            return certificateChainPath;
        }

        public void setCertificateChainPath(String certificateChainPath) {
            this.certificateChainPath = certificateChainPath;
        }

        public String getCertificatePath() {
            return certificatePath;
        }

        public void setCertificatePath(String certificatePath) {
            this.certificatePath = certificatePath;
        }
    }

    private int port = 55555;

    private String address = "0.0.0.0";

    private final Security security = new Security();

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Security getSecurity() {
        return security;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
