package demo.service.framework.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceExceptionHandler implements ExceptionHandler<ServiceException> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceExceptionHandler.class);

    @Override public ErrorResponse handle(ServiceException e) {
        LOGGER.error(e.getMessage(), e);
        return ErrorResponse.of(e.getHttpStatus(), e.getMessage(), e.getErrorCodes());
    }
}
