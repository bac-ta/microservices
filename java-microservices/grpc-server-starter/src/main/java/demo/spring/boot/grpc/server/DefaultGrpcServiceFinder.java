package demo.spring.boot.grpc.server;

import io.grpc.BindableService;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DefaultGrpcServiceFinder
        implements ApplicationContextAware, GrpcServiceFinder {

    private static final Logger logger = LoggerFactory.getLogger(DefaultGrpcServiceFinder.class);
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public Collection<GrpcServiceDefinition> findGrpcServices() {
        ServerInterceptorContext context =
                applicationContext.getBean(ServerInterceptorContext.class);
        Collection<ServerInterceptor> globalInterceptors = context.getServerInterceptors();

        return Stream.of(applicationContext.getBeanNamesForAnnotation(GrpcService.class))
                .map(beanName -> createGrpcServiceDefinition(globalInterceptors, beanName))
                .collect(Collectors.toList());
    }

    private GrpcServiceDefinition createGrpcServiceDefinition(
            Collection<ServerInterceptor> globalInterceptors, String beanName) {

        BindableService bindableService =
                applicationContext.getBean(beanName, BindableService.class);
        ServerServiceDefinition definition = bindableService.bindService();

        GrpcService grpcService =
                applicationContext.findAnnotationOnBean(beanName, GrpcService.class);
        definition = bindInterceptors(definition, grpcService, globalInterceptors);

        GrpcServiceDefinition result =
                new GrpcServiceDefinition(beanName, bindableService.getClass(), definition);
        logger.info("Found gRPC service: {}", result.info());
        return result;
    }

    private ServerServiceDefinition bindInterceptors(ServerServiceDefinition definition,
            GrpcService grpcService,
            Collection<ServerInterceptor> globalInterceptors) {

        List<ServerInterceptor> allInterceptors = new ArrayList<>();
        allInterceptors.addAll(globalInterceptors);
        allInterceptors.addAll(createGrpcServiceInterceptors(grpcService.interceptors()));

        return ServerInterceptors.intercept(definition, allInterceptors);
    }

    @SafeVarargs private final List<ServerInterceptor> createGrpcServiceInterceptors(
            Class<? extends ServerInterceptor>... interceptors) {

        return Stream.of(interceptors)
                .map(interceptorClass -> {
                    if (applicationContext.getBeanNamesForType(interceptorClass).length > 0) {
                        return applicationContext.getBean(interceptorClass);
                    } else {
                        try {
                            return interceptorClass.newInstance();
                        } catch (Exception e) {
                            throw new BeanCreationException(
                                    "Failed to create interceptor instance.", e);
                        }
                    }
                })
                .collect(Collectors.toList());
    }
}
