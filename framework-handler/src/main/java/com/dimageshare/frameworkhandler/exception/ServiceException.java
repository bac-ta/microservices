package com.dimageshare.frameworkhandler.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ServiceException extends RuntimeException {

    private final HttpStatus httpStatus;
    private final List<String> errorCodes;

    public ServiceException(HttpStatus httpStatus, String message, List<String> errorCodes) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorCodes = errorCodes;
    }

    HttpStatus getHttpStatus() {
        return httpStatus;
    }

    List<String> getErrorCodes() {
        return errorCodes;
    }

}
