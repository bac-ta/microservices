package com.dimageshare.master.model.request;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Data
public class UserRequest {
    @NotBlank
    private String name;
    private Integer gender;
    @NotBlank
    private String email;
    @Valid
    private Integer age;
    @NotBlank
    private String phoneNumber;
    @NotBlank
    private Integer departmentId;
}
