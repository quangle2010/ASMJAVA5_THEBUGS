package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatisticalController {
    @GetMapping("/admin/statistical-order")
    public String statisticalOrderPage(Model model) {
        model.addAttribute("namePage", "Thống kê hóa đơn");
        model.addAttribute("view", "admin/statistical-order");
        return "index";
    }
    @GetMapping("/admin/statistical-product")
    public String statisticalProductPage(Model model) {
        model.addAttribute("namePage", "Thống kê sản phẩm");
        model.addAttribute("view", "admin/statistical-product");
        return "index";
    }

}
