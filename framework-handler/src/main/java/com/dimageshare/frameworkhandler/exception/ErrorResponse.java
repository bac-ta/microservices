package com.dimageshare.frameworkhandler.exception;

import lombok.Data;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.google.common.base.Preconditions.checkArgument;

import org.springframework.http.HttpStatus;

@Data
public class ErrorResponse {
    @JsonIgnore
    private final HttpStatus httpStatus;
    private final String message;
    @JsonProperty(value = "error_codes")
    private final List<String> errorCodes;

    public ErrorResponse(HttpStatus httpStatus, String message, List<String> errorCodes) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.errorCodes = errorCodes;
    }

    public static ErrorResponse of(HttpStatus httpStatus, String message, List<String> errorCodes) {
        checkArgument(httpStatus != null, "HttpStatus must not to be null.");

        String errMsg = message == null ? "" : message;
        List<String> list = errorCodes == null ? Collections.emptyList() : errorCodes;

        return new ErrorResponse(httpStatus, errMsg, list);
    }
}
