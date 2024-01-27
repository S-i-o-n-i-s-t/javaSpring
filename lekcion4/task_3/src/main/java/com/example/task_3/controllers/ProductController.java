package com.example.task_3.controllers;

import com.example.task_3.model.Product;
import com.example.task_3.servises.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor // аннотация для взаимодействия библиотеки lamboc и spring
                    // @Auno... аннотация в этом лучае не требуется
public class ProductController {
    private ProjectService projectService;

    @GetMapping("/prod")
    public String getProduct(Model model){
        model.addAttribute("products", projectService.faindProduct());
        return "products";
    }

    @PostMapping("/prod")
    public String addProd(Product p, Model model){
        projectService.addProduct(p);
        model.addAttribute("product", projectService.faindProduct());
        return "products";
    }
}
