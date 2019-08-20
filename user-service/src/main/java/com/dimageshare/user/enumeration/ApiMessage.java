package com.dimageshare.user.enumeration;

import lombok.Getter;

import java.util.Arrays;

public enum ApiMessage {
    ERROR(0, "Have error"),
    NOT_EXIST(1, "NOT exist"),
    SUCCESS(2, "Success"),
    UNKNOWN(3, "Unknown");
    @Getter
    private int code;

    private String description;

    ApiMessage(int code, final String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    public static ApiMessage findByCode(int code) {
        return Arrays.stream(ApiMessage.values())
                .filter(apiMessage -> apiMessage.getCode() == code)
                .findFirst().orElse(ApiMessage.UNKNOWN);
    }
}
