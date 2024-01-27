package com.example.task_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AbboutController {

    @GetMapping("/about")
    public String about(){
        return "about.html";
    }
}
