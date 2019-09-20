package demo.backend.master.rpc;

import com.google.common.collect.Lists;
import demo.service.framework.grpc.ErrorHandlingInterceptor;
import demo.service.framework.logging.GrpcServerLoggingInterceptor;
import demo.spring.boot.grpc.server.ServerInterceptorInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MasterGrpcServerConfiguration {

    @Bean
    public ServerInterceptorInitializer globalServerInterceptorInitializer() {
        return () -> Lists.newArrayList(
                // TODO: Check authentication
                //new GrpcHeaderServerInterceptor(),
                new ErrorHandlingInterceptor(),
                new GrpcServerLoggingInterceptor()
        );
    }
}
