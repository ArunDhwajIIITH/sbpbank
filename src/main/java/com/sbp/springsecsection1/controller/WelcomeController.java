package com.sbp.springsecsection1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcomeS")
    public String sayWelcome() {
        return "Welcome to SBP Bank Security";
    }
}
