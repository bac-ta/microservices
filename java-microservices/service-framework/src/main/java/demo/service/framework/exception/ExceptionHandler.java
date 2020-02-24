package demo.service.framework.exception;

public interface ExceptionHandler<T extends Exception> {

    ErrorResponse handle(T exception);

}
