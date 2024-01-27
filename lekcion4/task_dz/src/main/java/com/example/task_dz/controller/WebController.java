package com.example.task_dz.controller;

import com.example.task_dz.model.User;
import com.example.task_dz.servises.ServisesHelloUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    ServisesHelloUser worldServises = new ServisesHelloUser();
    @GetMapping("/hello")
    public String helloWeb(Model model){
        model.addAttribute("HELLO", worldServises.helloUser());
        return "hello";
    }
    @PostMapping("/hello")
    public String addUser(User n, Model model){
        worldServises.setUser(n.getName());
        model.addAttribute("text", worldServises.getUser());
        return "hello";//World
    }
}
