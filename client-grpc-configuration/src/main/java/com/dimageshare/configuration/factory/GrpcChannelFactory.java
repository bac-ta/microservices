package com.dimageshare.configuration.factory;

import io.grpc.Channel;
import io.grpc.ClientInterceptor;

import java.util.List;

/**
 * @author bac-ta
 * <p>
 * This inteface provide method create 1 channel grpc
 */
public interface GrpcChannelFactory {
    Channel createChannel(String name, List<ClientInterceptor> interceptors);
}
