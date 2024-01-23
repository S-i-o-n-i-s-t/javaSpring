package com.example.taskDZ.services;


import com.example.taskDZ.domen.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    /**
     * Метод, который выводит в консоль поле name из экземпляра класса User, который находится в агументе метода
     * (будет использоваться при создании класса)
     * @param user Эклемпляр класса User
     */
    public void notificationUser(User user){
        System.out.println("Создан экземпляр класса User с полем name = " + user.getName());
    }
}
