package com.dimageshare.configuration.finder;

import io.grpc.ServerServiceDefinition;

public class GrpcServerDefinition {
    private final String beanName;
    private final Class<?> beanClass;
    private final ServerServiceDefinition definition;

    public GrpcServerDefinition(String beanName, Class<?> beanClass, ServerServiceDefinition definition) {
        this.beanName = beanName;
        this.beanClass = beanClass;
        this.definition = definition;
    }

    public ServerServiceDefinition getDefinition() {
        return definition;
    }

    public String info() {
        return "factory:" + definition.getServiceDescriptor().getName() +
                ", class:" + beanClass.getClass().getName() +
                ", beanName:'" + beanName;
    }

}
