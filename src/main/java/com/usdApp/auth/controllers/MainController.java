package com.usdApp.auth.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping({ "/", "/login" })
    public String loginForm() {
        return "login";
    }
    
    @GetMapping( "/loginExitoso")
    public String login() {
        return "loginExitoso";
    }

}
