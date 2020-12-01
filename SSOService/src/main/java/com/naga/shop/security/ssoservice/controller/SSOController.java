package com.naga.shop.security.ssoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sso/signin")
public class SSOController {

    @GetMapping("/")
    public String sayWelcome()
    {
        return "Welcome to Shopping Service!!!";
    }
}
