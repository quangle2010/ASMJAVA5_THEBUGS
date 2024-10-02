package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MenuController {
    @GetMapping("/menu")
    public String MenuPage(Model model) {
        model.addAttribute("namePage", "Thực đơn");
        model.addAttribute("view", "user/menu");
        return "index";
    }
    
}
