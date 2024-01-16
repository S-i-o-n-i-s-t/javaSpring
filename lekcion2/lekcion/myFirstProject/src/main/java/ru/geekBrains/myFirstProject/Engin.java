package ru.geekBrains.myFirstProject;

import org.springframework.stereotype.Component;

@Component
public class Engin {
    public Engin() {
        System.out.println("Двигатель установлен");
    }

    public void go(){
        System.out.println("Поехали!!!");
    }
}
