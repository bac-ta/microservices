package com.dimageshare.master.model.response;

import lombok.Data;

@Data
public class UserResponse {
    private int id;
    private String name;
    private String gender;
    private String email;
    private Integer age;
    private String phoneNumber;
    private int departmentId;

    public UserResponse() {
        super();
    }

    public UserResponse(int id, String name, String gender, String email, Integer age, String phoneNumber, int departmentId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.departmentId = departmentId;
    }
}
