package com.JwtAuthentications.SpringsecurityJwt.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Home")
public class HomeController {
    @GetMapping("/login")
    public String login(){
        return "loginpage";
    }@GetMapping("home")
    public String home(){
        return "homepage";
    }
}
