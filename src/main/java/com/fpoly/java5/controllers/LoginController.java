package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("namePage", "Đăng nhập");
        model.addAttribute("view", "user/login");
        return "index";
    }
    
}
