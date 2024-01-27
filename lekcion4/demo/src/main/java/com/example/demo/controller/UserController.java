package com.example.demo.controller;

import com.example.demo.servises.UserServises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServises userServises;

    @GetMapping
    public String listUsers(Model model){
        model.addAttribute("users", userServises.getAllUsers());
        return "users";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id, Model model){
        model.addAttribute("users", userServises.getUserById(id));
        return "userProfile";
    }
}
