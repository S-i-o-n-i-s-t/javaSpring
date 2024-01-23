package com.example.taskDZ.controllers;

import com.example.taskDZ.domen.User;
import com.example.taskDZ.services.RegistrationService;
import com.example.taskDZ.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * Поле this класса типа RegistrationService
     */
    @Autowired
    private RegistrationService registrationService;

    /**
     *  Метод для "чтения базы данных"
     * @return "База данных"
     */
    @GetMapping
    public List<User> userList(){
        return registrationService.getDataProcessingService().getUserRepository().getUserList();
    }

    /**
     * Метод добавления экземпляров класса User в "базу данных"
     * @param user Экземпляр класса User
     * @return Сообщение об успешном завершении работы метода
     */
    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user){
        System.out.println("наш пользователь - " + user);
        System.out.println("имя - " + user.getName());
        System.out.println("мыло - " + user.getEmail());
        System.out.println("возраст - " + user.getAge());
        registrationService.processRegistration(user);
        return "Пользователь добавлен";
    }
}
