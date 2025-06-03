package com.arsh.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SecurityController {


    @GetMapping("/greet")
    public String greet() {
        return "Hello Arsh! HOW ARE YOU";
    }
}
