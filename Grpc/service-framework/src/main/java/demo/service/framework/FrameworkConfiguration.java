package demo.service.framework;

import demo.service.framework.exception.ErrorResponse;
import demo.service.framework.exception.ExceptionHandler;
import demo.service.framework.exception.ServiceException;
import demo.service.framework.exception.ServiceExceptionHandler;
import io.grpc.StatusRuntimeException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FrameworkConfiguration { 
    @Bean
    public ExceptionHandler<StatusRuntimeException> statusRuntimeExceptionHandler() {
        return new ExceptionHandler<StatusRuntimeException>() {
            @Override
            public ErrorResponse handle(StatusRuntimeException exception) {
                return null;
            }
        };
    }

    @Bean
    public ExceptionHandler<ServiceException> serviceExceptionHandler() {
        return new ServiceExceptionHandler();
    }
    
}
