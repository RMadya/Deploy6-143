package com.tugas.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping({"/", "/login", "/login.html"})
    public String loginPage() {
        return "login";
    }

    @GetMapping({"/home", "/home.html"})
    public String homePage() {
        return "home";
    }

    @GetMapping({"/form", "/form.html"})
    public String formPage() {
        return "form";
    }
}
