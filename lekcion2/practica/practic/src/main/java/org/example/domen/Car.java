package org.example.domen;

public class Car {
    private String model, made;

    public Car(String model, String made) {
        this.model = model;
        this.made = made;
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
