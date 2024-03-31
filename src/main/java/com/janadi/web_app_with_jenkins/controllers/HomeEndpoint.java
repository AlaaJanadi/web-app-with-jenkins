package com.janadi.web_app_with_jenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeEndpoint {
    @GetMapping
    public String home() {
        return "Welcome to the home page!";
    }
}
