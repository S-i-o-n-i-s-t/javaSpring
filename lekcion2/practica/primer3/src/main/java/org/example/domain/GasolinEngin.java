package org.example.domain;


import org.springframework.stereotype.Component;

@Component
public class GasolinEngin implements Engin{
    @Override
    public void startEngin() {
        System.out.println("Запущен Бензиновый двигатель");
    }
}
