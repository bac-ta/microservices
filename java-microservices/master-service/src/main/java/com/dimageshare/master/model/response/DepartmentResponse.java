package com.dimageshare.master.model.response;

import lombok.Data;

@Data
public class DepartmentResponse {
    private int id;
    private String name;
    private String description;

    public DepartmentResponse(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
