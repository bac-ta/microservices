package com.dimageshare.user.enumeration;

import lombok.Getter;

import java.util.Arrays;

public enum Gender {
    MALE(0, "made"),
    FEMALE(1, "female"),
    OTHER(2, "other"),
    UNKNOWN(3, "unknown");
    @Getter
    private int code;

    private String description;

    Gender(int code, final String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    public static Gender findByCode(int code) {
        return Arrays.stream(Gender.values())
                .filter(gender -> gender.getCode() == code)
                .findFirst().orElse(Gender.UNKNOWN);
    }
}
