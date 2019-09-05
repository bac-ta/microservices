package com.dimageshare.master.controller;

import com.dimageshare.master.model.response.DepartmentResponse;
import com.dimageshare.master.service.department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    private DepartmentService service;

    @Autowired
    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    public ResponseEntity<DepartmentResponse>
}
