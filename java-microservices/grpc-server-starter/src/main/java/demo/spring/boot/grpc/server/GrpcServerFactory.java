package demo.spring.boot.grpc.server;

import io.grpc.Server;

public interface GrpcServerFactory {
    Server createServer();

    void addService(GrpcServiceDefinition service);

    String getAddress();

    int getPort();
}
