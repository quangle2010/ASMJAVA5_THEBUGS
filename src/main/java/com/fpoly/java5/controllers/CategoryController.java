package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    @GetMapping("/admin/list-category")
    public String listCetagoryPage(Model model) {
        model.addAttribute("namePage", "Danh sách loại sản phẩm");
        model.addAttribute("view", "admin/list-category");
        return "index";
    }

    @GetMapping("/admin/form-category")
    public String fromCetagoryPage(Model model) {
        model.addAttribute("namePage", "Form loại sản phẩm");
        model.addAttribute("view", "admin/form-category");
        return "index";
    }
}
