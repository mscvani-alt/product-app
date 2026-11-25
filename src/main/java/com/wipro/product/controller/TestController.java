package com.wipro.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/public/hello")
    public String publicEndpoint() {
        return "Anyone can see this without logging in!";
    }

    @GetMapping("/secure/hello")
    public String secureEndpoint() {
        return "You are logged in! Welcome to the secured API.";
    }
}