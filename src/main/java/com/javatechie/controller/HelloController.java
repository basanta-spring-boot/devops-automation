package com.javatechie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/text")
    public String text(){
        return "Welcome to javatechie";
    }
}
