package ru.geekBrains.myFirstProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    Car car;
    @GetMapping(value = "/car")
    public String start(){
        car.start();
        return "Автомобиль запущен";
    }
}
