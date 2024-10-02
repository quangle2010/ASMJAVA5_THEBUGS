package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("namePage", "Đăng ký");
        model.addAttribute("view", "user/register");
        return "index";
    }
    
}
