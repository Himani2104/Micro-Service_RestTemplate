package com.example.restemplate.controller;

import com.example.restemplate.entity.Contact;
import com.example.restemplate.entity.User;
import com.example.restemplate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUserDetails(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.getUser(id),HttpStatus.OK);

    }

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.createNewUser(user), HttpStatus.OK);
    }
}
