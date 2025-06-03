package com.arsh.security.controller;

import com.arsh.security.model.User;
import com.arsh.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // Constructor DI
    @Autowired
    private UserController(UserService service) {
        this.userService = service;
    }

    @PostMapping
    public User registerUser(@RequestBody User user) {
        return this.userService.createUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return this.userService.getUsers();
    }
}