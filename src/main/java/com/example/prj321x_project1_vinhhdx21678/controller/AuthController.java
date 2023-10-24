package com.example.prj321x_project1_vinhhdx21678.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginUser() {
        return "login";
    }

    @GetMapping("home")
    public String hello(ModelMap model) {
//        model.addAttribute("hello", "Hello Đồng");
        return "hello";
    }

    @GetMapping("admin/login")
    public String loginAdmin() {
        return "admin/login";
    }

    @GetMapping("admin/home")
    public String helloAdmin(ModelMap model) {
//        model.addAttribute("hello", "Hello Đồng");
        return "admin/hello";
    }
}
