package org.example.domain;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DizelEngin implements Engin{
    @Override
    public void startEngin() {
        System.out.println("Запущен Дизельный двигатель");
    }
}
