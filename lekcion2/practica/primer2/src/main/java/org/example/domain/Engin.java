package org.example.domain;

import org.springframework.stereotype.Component;

@Component
public class Engin {
    private String type = "Бензиновый";

    @Override
    public String toString() {
        return "Engin{" +
                "type='" + type + '\'' +
                '}';
    }

    public Engin(){
        System.out.println("Двигатель создан");
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
