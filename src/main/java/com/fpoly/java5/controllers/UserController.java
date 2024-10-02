package com.fpoly.java5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/admin/list-user")
    public String listCetagoryPage(Model model) {
        model.addAttribute("namePage", "Danh sách người dùng");
        model.addAttribute("view", "admin/list-user");
        return "index";
    }

    @GetMapping("/admin/form-user")
    public String fromCetagoryPage(Model model) {
        model.addAttribute("namePage", "Form người dùng");
        model.addAttribute("view", "admin/form-user");
        return "index";
    }
    @GetMapping("/user/profile")
    public String fromProfilePage(Model model) {
        model.addAttribute("namePage", "Thông tin người dùng");
        model.addAttribute("view", "user/profile");
        return "index";
    }
    
    @GetMapping("/user/restpass")
    public String fromRestpassPage(Model model) {
        model.addAttribute("namePage", "Đổi mật khẩu");
        model.addAttribute("view", "user/repass");
        return "index";
    }
    @GetMapping("/forgotpass")
    public String fromForgotpassPage(Model model) {
        model.addAttribute("namePage", "Quên mật khẩu");
        model.addAttribute("view", "user/forgotpass");
        return "index";
    }
}
