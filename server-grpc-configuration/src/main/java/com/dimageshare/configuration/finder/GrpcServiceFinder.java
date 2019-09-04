package com.dimageshare.configuration.finder;

import java.util.Collection;

public interface GrpcServiceFinder {
    Collection<GrpcServerDefinition> findGrpcServices();
}
