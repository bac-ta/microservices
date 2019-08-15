package com.dimageshare.configuration.factory;

import io.grpc.ServerInterceptor;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface GrpcServerService {
    Class<? extends ServerInterceptor>[] interceptors() default {};
}
