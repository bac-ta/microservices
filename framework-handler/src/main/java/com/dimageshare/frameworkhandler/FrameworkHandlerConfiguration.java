package com.dimageshare.frameworkhandler;

import com.dimageshare.frameworkhandler.exception.ErrorResponse;
import com.dimageshare.frameworkhandler.exception.ExceptionHandler;
import com.dimageshare.frameworkhandler.exception.ServiceException;
import com.dimageshare.frameworkhandler.exception.ServiceExceptionHandler;
import io.grpc.StatusRuntimeException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;


@Configuration
public class FrameworkHandlerConfiguration {

    @Bean
    public ExceptionHandler<StatusRuntimeException> statusRuntimeExceptionHandler() {
        return exception -> {
            int statusCode = exception.getStatus().getCode().value();
            HttpStatus httpStatus = HttpStatus.valueOf(statusCode);
            String message = exception.getMessage();
            return ErrorResponse.of(httpStatus, message, new ArrayList<>());
        };
    }

    @Bean
    public ExceptionHandler<ServiceException> serviceExceptionHandler() {
        return new ServiceExceptionHandler();
    }

}
