package demo.spring.boot.grpc.server;

import io.grpc.ServerInterceptor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Service;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface GrpcService {

    Class<?> value();

    Class<? extends ServerInterceptor>[] interceptors() default {};
}
