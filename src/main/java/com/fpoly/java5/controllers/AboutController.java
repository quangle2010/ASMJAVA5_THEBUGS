package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AboutController {
@GetMapping("/about")
public String aboutPage(Model model) {
    model.addAttribute("namePage", "Giới thiệu");
    model.addAttribute("view", "user/about");
    return "index";
}

}
