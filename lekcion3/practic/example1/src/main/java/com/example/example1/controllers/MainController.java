package com.example.example1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Retention;

@Controller //ищет html файл в static
public class MainController {

    // обработка запроса (что должен принять "tome cat" )
    @RequestMapping("/home")
    public String hjome(){
        return "home.html";
    }

}
