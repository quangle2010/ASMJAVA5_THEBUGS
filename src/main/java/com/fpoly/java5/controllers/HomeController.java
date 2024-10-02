package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
@GetMapping("/home")
public String homePage(Model model) {
    model.addAttribute("view", "user/home");
    return "index";
}

}
