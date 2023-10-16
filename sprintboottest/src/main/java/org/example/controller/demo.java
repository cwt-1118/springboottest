package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
    @GetMapping("/demo/hello")
    public String hello(){
        return "hello, Springboot";
    }
}
