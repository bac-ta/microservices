package com.dimageshare.master.controller;

import com.dimageshare.master.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @GetMapping(value = "/user/sum")
    public ResponseEntity<Integer> getSum(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return new ResponseEntity<>(userService.getSum(a, b), HttpStatus.OK);
    }
}
