package com.waytoodanny.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greeting() {
        var currentEnv = Optional.ofNullable(System.getenv("ENVIRONMENT")).orElse("unknown");
        return String.format("Hello from the greeting service on %s environment!", currentEnv);
    }
}
