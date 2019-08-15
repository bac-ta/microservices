package com.dimageshare.configuration.factory;

import com.dimageshare.configuration.finder.GrpcServerDefinition;
import io.grpc.Server;

public interface GrpcServerFactory {

    Server createServer();

    void addService(GrpcServerDefinition service);

    String getAddress();

    int getPort();

}
