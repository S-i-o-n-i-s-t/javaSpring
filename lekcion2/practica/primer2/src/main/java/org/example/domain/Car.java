package org.example.domain;


import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model, made;
    private Engin engin;

    public Car() {
        System.out.println("Автомобиль создан");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", made='" + made + '\'' +
                ", engin=" + engin +
                '}';
    }
    public Engin getEngin() {
        return engin;
    }

    public void setEngin(Engin engin) {
        this.engin = engin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }
}
