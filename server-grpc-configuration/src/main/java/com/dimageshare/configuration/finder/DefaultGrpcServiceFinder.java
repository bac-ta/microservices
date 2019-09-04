package com.dimageshare.configuration.finder;

import com.dimageshare.configuration.interceptor.ServerInterceptorContext;
import com.dimageshare.configuration.factory.GrpcServerService;
import io.grpc.BindableService;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultGrpcServiceFinder
        implements ApplicationContextAware, GrpcServiceFinder {

    private static final Logger logger = LoggerFactory.getLogger(DefaultGrpcServiceFinder.class);
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public Collection<GrpcServerDefinition> findGrpcServices() {
        ServerInterceptorContext context =
                applicationContext.getBean(ServerInterceptorContext.class);
        Collection<ServerInterceptor> globalInterceptors = context.getServerInterceptors();

        return Stream.of(applicationContext.getBeanNamesForAnnotation(GrpcServerService.class))
                .map(beanName -> createGrpcServiceDefinition(globalInterceptors, beanName))
                .collect(Collectors.toList());
    }

    private GrpcServerDefinition createGrpcServiceDefinition(
            Collection<ServerInterceptor> globalInterceptors, String beanName) {

        BindableService bindableService =
                applicationContext.getBean(beanName, BindableService.class);
        ServerServiceDefinition definition = bindableService.bindService();

        GrpcServerService grpcService =
                applicationContext.findAnnotationOnBean(beanName, GrpcServerService.class);
        definition = bindInterceptors(definition, grpcService, globalInterceptors);

        GrpcServerDefinition result =
                new GrpcServerDefinition(beanName, bindableService.getClass(), definition);
        logger.info("Found gRPC factory: {}", result.info());
        return result;
    }

    private ServerServiceDefinition bindInterceptors(ServerServiceDefinition definition,
                                                     GrpcServerService grpcService,
                                                     Collection<ServerInterceptor> globalInterceptors) {

        List<ServerInterceptor> allInterceptors = new ArrayList<>();
        allInterceptors.addAll(globalInterceptors);
        allInterceptors.addAll(createGrpcServiceInterceptors(grpcService.interceptors()));

        return ServerInterceptors.intercept(definition, allInterceptors);
    }

    @SafeVarargs
    private final List<ServerInterceptor> createGrpcServiceInterceptors(
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
