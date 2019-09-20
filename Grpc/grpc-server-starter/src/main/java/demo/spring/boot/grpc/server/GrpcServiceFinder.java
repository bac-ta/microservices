package demo.spring.boot.grpc.server;

import java.util.Collection;

public interface GrpcServiceFinder {
    Collection<GrpcServiceDefinition> findGrpcServices();
}
