package com.example.springbooteks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot deployed on Kubernetes! Using GitHub Actions CI/CD pipeline with Docker and Kind.";
    }
}