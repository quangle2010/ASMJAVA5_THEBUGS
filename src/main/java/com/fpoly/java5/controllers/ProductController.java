package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/product")
    public String productPage(Model model) {
        model.addAttribute("namePage", "Sản phẩm");
        model.addAttribute("view", "user/product");
        return "index";
    }

    @GetMapping("/productdetail")
    public String productdetailPage(Model model) {
        model.addAttribute("namePage", "Chi tiết sản phẩm");
        model.addAttribute("view", "user/productdetail");
        return "index";
    }

    @GetMapping("/admin/list-product")
    public String listProductPage(Model model) {
        model.addAttribute("namePage", "Danh sách sản phẩm");
        model.addAttribute("view", "admin/list-product");
        return "index";
    }

    @GetMapping("/admin/form-product")
    public String fromProductPage(Model model) {
        model.addAttribute("namePage", "Form sản phẩm");
        model.addAttribute("view", "admin/form-product");
        return "index";
    }

}
