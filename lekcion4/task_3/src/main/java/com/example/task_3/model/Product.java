package com.example.task_3.model;

import lombok.Data; // библиотека для автоматического заполнения "геттеров и сеттеров", Создает конструкторы, и переопределяет toString

@Data
public class Product {

    private String name;
    private double price;
}
