package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ContactController {
    @GetMapping("/contact")
    public String contactPage(Model model) {
        model.addAttribute("namePage", "Liên hệ");
        model.addAttribute("view", "user/contact");
        return "index";
    }
    
}
