package org.example;

import org.example.config.ProjectConfig;
import org.example.domen.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car simpleCar = context.getBean("mainCar", Car.class);
        System.out.println(simpleCar.getMade() + " " + simpleCar.getModel());

        System.out.println(context.getBean(String.class));
        System.out.println(context.getBean(int.class));
    }
}