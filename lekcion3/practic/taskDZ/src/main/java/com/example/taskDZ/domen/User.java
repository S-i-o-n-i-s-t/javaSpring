package com.example.taskDZ.domen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class User {
    //region поля
    /**
     * Поля name и email типа String
     */
    private String name, email;
    /**
     * Поля name и age типа int
     */
    private int age;
    //endregion

    //region Сеттеры/Геттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion

    //region Переопределение toString
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
    //endregion
}
