package demo.service.framework.exception;

import io.grpc.StatusRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandlers {

    @Autowired @Qualifier("statusRuntimeExceptionHandler")
    private ExceptionHandler<StatusRuntimeException> statusExceptionHandler;

    @Autowired @Qualifier("serviceExceptionHandler")
    private ExceptionHandler<ServiceException> serviceExceptionHandler;

    @org.springframework.web.bind.annotation.ExceptionHandler(StatusRuntimeException.class)
    public ResponseEntity<ErrorResponse> handleStatusRuntimeException(StatusRuntimeException sre) {
        ErrorResponse errorResponse = statusExceptionHandler.handle(sre);
        return new ResponseEntity<>(errorResponse, errorResponse.getHttpStatus());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(ServiceException.class)
    public ResponseEntity<ErrorResponse> handleServiceException(ServiceException se) {
        ErrorResponse errorResponse = serviceExceptionHandler.handle(se);
        return new ResponseEntity<>(errorResponse, errorResponse.getHttpStatus());
    }

}

