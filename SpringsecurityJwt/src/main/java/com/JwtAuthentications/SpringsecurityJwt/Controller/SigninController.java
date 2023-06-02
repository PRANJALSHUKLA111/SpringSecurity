package com.JwtAuthentications.SpringsecurityJwt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SigninController {
    @GetMapping("/enter")
    public String enter(){
        return "enter.html";
    }
}
