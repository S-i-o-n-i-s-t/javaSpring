package ru.geekBrains.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Car {
    @Autowired
    Engin engin;

    public void start() {
        engin.go();
    }
}
