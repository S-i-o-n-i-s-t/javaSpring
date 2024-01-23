package com.example.example1.helloController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Не ищет html файл в static
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/chao")
    public String chao(){
        return "chao";
    }
}
