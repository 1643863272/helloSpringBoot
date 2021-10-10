package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class controller {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world Spring Boot！这是一个用Spring Boot开发的网站。";
    }
}
