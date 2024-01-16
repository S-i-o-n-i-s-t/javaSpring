package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.example.domain.Engin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Engin engin = context.getBean(Engin.class);
        System.out.println(engin);
        Car car = context.getBean(Car.class);

        System.out.println(car);

    }
}