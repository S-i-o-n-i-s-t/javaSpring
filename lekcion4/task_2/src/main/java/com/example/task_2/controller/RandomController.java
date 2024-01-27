package com.example.task_2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class RandomController {

    @Value("${data.parametr.min:25}")
    private Integer minDefault;

    @Value("${data.parametr.max:100}")
    private Integer maxDefault;

    @GetMapping("/random")
    public String randomNext(Model model){
        model.addAttribute("number", new Random().nextInt(1,100));
        return "random.html";
    }
    @GetMapping("/numbers/{min}/{max}")
    public String numbersAdd(@PathVariable int min,
                             @PathVariable int max,
                             Model model){
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        model.addAttribute("minDefault", minDefault);
        model.addAttribute("maxDefault", maxDefault);
        model.addAttribute("number", new Random().nextInt(min,max));
        return "task_random_2.html";

    }
    @GetMapping("/numbers")
    public String numbersAdd2(@RequestParam Integer min,
                             @RequestParam Integer max,
                             Model model){
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        model.addAttribute("number", new Random().nextInt(min,max));
        return "task_random_2.html";

    }

}
