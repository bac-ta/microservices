package com.dimageshare.department.enumeration;

import lombok.Getter;

import java.util.Arrays;

public enum GenderEnum {
    MALE(0, "made"),
    FEMALE(1, "female"),
    OTHER(2, "other"),
    UNKNOWN(3, "unknown");
    @Getter
    private int code;

    private String description;

    GenderEnum(int code, final String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    public static GenderEnum findByCode(int code) {
        return Arrays.stream(GenderEnum.values())
                .filter(genderEnum -> genderEnum.getCode() == code)
                .findFirst().orElse(GenderEnum.UNKNOWN);
    }
}
