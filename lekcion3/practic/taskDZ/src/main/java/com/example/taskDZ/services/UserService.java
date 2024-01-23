package com.example.taskDZ.services;

import com.example.taskDZ.domen.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /**
     * Поле класса this, является экземпляром класса NotificationService
     */
    NotificationService notificationService = new NotificationService();

    /**
     * Пустой конструктор класса
     */
    public UserService(){
    }

    /**
     * Метод создания экземпляра класса User
     * @param name Аргумент для заполнения поля name в создаваемом экземпляре класса User
     * @param email Аргумент для заполнения поля email в создаваемом экземпляре класса User
     * @param age Аргумент для заполнения поля age в создаваемом экземпляре класса User
     * @return Метод возвращает экземпляр класса User
     */
    public User createUser(String name, String email ,int age){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setAge(age);
        // Выводим в консоль сообщение, что создан экземпляр класса, и его поле name
        notificationService.notificationUser(user);
        return user;
    }
}
