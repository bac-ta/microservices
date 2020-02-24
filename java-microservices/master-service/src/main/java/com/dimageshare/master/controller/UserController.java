package com.dimageshare.master.controller;

import com.dimageshare.master.model.request.UserRequest;
import com.dimageshare.master.model.response.UserResponse;
import com.dimageshare.master.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(value = "/user/findById")
    public ResponseEntity<UserResponse> findById(@RequestParam(value = "id") int id) {
        UserResponse response = service.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/user/findAll")
    public ResponseEntity<List<UserResponse>> findAll() {
        List<UserResponse> userResponses = service.findAll();
        return new ResponseEntity<>(userResponses, HttpStatus.OK);
    }

    @GetMapping(value = "/user/findByDepartmentId")
    public ResponseEntity<List<UserResponse>> findByDepartmentId(@RequestParam(value = "departmentId") int departmentId) {
        List<UserResponse> userResponses = service.findByDepartmentId(departmentId);
        return new ResponseEntity<>(userResponses, HttpStatus.OK);
    }

    @DeleteMapping(value = "/user/removeById")
    public ResponseEntity<Void> removeById(@RequestParam(value = "id") int id) {
        service.removeUserById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/user/saveUser")
    public ResponseEntity<Void> saveUser(@RequestBody UserRequest request) {
        service.saveUser(request);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
