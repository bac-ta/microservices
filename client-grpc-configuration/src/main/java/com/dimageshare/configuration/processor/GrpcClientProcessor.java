package com.dimageshare.configuration.processor;

import com.dimageshare.configuration.factory.GrpcChannelFactory;
import com.dimageshare.configuration.interceptor.GrpcClient;
import io.grpc.Channel;
import io.grpc.ClientInterceptor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GrpcClientProcessor implements BeanPostProcessor {

    private Map<String, ArrayList<Class>> beansToProcess = new HashMap<>();

    @Autowired
    private DefaultListableBeanFactory beanFactory;

    @Autowired
    private GrpcChannelFactory channelFactory;

    public GrpcClientProcessor() {
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        Class cls = bean.getClass();
        do {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(GrpcClient.class)) {
                    if (!beansToProcess.containsKey(beanName))
                        beansToProcess.put(beanName, new ArrayList<>());

                    beansToProcess.get(beanName).add(cls);
                }
            }
            cls = cls.getSuperclass();
        } while (cls != null);

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        if (!beansToProcess.containsKey(beanName)) {
            return bean;
        }

        for (Class cls : beansToProcess.get(beanName)) {
            for (Field field : cls.getDeclaredFields()) {
                GrpcClient grpcClient = AnnotationUtils.getAnnotation(field, GrpcClient.class);
                if (null != grpcClient) {
                    Channel channel = channelFactory.createChannel(grpcClient.value(),
                            createInterceptors(grpcClient));
                    ReflectionUtils.makeAccessible(field);
                    ReflectionUtils.setField(field, bean, channel);
                }
            }
        }

        return bean;
    }

    private List<ClientInterceptor> createInterceptors(GrpcClient grpcClient) {
        return Stream.of(grpcClient.interceptors())
                .map(aClass -> {
                    if (beanFactory.getBeanNamesForType(ClientInterceptor.class).length > 0) {
                        return beanFactory.getBean(aClass);
                    } else {
                        try {
                            return aClass.newInstance();
                        } catch (Exception e) {
                            throw new BeanCreationException("Failed to create interceptor", e);
                        }
                    }
                })
                .collect(Collectors.toList());
    }

}
