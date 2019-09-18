package com.dimageshare.master.controller;

import com.dimageshare.master.model.request.DepartmentRequest;
import com.dimageshare.master.model.response.DepartmentResponse;
import com.dimageshare.master.service.department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    private DepartmentService service;

    @Autowired
    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping(value = "/department/findById")
    public ResponseEntity<DepartmentResponse> findById(@RequestParam(value = "id") int id) {
        DepartmentResponse response = service.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/department/findById")
    public ResponseEntity<List<DepartmentResponse>> findAll() {
        List<DepartmentResponse> responses = service.findAll();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @DeleteMapping(value = "/department/removeById")
    public ResponseEntity<Void> removeById(@RequestParam(value = "id") int id) {
        service.removeById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping(value = "/user/saveUser")
    public ResponseEntity<Void> saveDepartment(@RequestBody DepartmentRequest request) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
