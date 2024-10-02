package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CartController {
@GetMapping("/user/cart")
public String cartPage(Model model) {
    model.addAttribute("view", "user/cart");
    return "index";
}

}
