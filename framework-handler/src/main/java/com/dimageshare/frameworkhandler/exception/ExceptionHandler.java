package com.dimageshare.frameworkhandler.exception;

public interface ExceptionHandler<T extends Exception> {

    ErrorResponse handle(T exception);

}
