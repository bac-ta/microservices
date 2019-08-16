package com.dimageshare.configuration.interceptor;

import com.dimageshare.configuration.interceptor.ClientInterceptorInitializer;
import io.grpc.ClientInterceptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ClientInterceptorContext implements ApplicationContextAware {

    private final List<ClientInterceptor> clientInterceptors = new ArrayList<>();
    private ApplicationContext applicationContext;

    @Override public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void init() {
        Map<String, ClientInterceptorInitializer> adapters =
                applicationContext.getBeansOfType(ClientInterceptorInitializer.class);
        for (ClientInterceptorInitializer initializer : adapters.values()) {
            Collection<ClientInterceptor> interceptors = initializer.interceptors();
            if (interceptors != null && interceptors.size() != 0) {
                clientInterceptors.addAll(interceptors);
            }
        }
    }

    public Collection<ClientInterceptor> getClientInterceptors() {
        return Collections.unmodifiableCollection(clientInterceptors);
    }

}
