package com.janadi.web_app_with_jenkins.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.BindParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtmlEndpoint {
    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @PostMapping("/takeIt")
    public String takeIt(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("message") String message) {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);
        return "redirect:/index";
    }
}
