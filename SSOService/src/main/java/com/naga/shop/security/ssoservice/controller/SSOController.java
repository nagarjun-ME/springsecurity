package com.naga.shop.security.ssoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sso/in")
public class SSOController {

    @GetMapping("/user")
    public String sayWelcome()
    {
        return "Welcome to Shopping Service!!!";
    }

    @GetMapping("/admin")
    public String sayWelcomeAdmin()
    {
        return "<h1>Welcome to Shopping Service. Admin !!!</h1>";
    }
}
