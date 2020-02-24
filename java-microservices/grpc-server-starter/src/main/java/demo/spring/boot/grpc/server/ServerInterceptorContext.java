package demo.spring.boot.grpc.server;

import io.grpc.ServerInterceptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ServerInterceptorContext implements ApplicationContextAware {

    private final List<ServerInterceptor> serverInterceptors = new ArrayList<>();

    private ApplicationContext applicationContext;

    @Override public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void init() {
        Map<String, ServerInterceptorInitializer> map =
                applicationContext.getBeansOfType(ServerInterceptorInitializer.class);
        for (ServerInterceptorInitializer initializer: map.values()) {
            Optional.of(initializer.interceptors()).ifPresent(serverInterceptors::addAll);
        }
    }

    public Collection<ServerInterceptor> getServerInterceptors() {
        return Collections.unmodifiableCollection(serverInterceptors);
    }
}
