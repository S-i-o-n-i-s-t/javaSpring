package com.example.taskDZ.controllers;

import com.example.taskDZ.domen.User;
import com.example.taskDZ.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    /**
     * поле типа класса DataProcessingService
     */
    @Autowired
    private DataProcessingService dataProcessingService;

    /**
     * Метод для вывода списка задач
     * @return Список задач
     */
    @GetMapping
    public List<String> getAllTasks(){
        List<String> tasksList = new ArrayList<>();
        tasksList.add("sort");
        tasksList.add("filter");
        tasksList.add("calc");
        return tasksList;
    }

    /**
     * Метод сортировки List<User> (нашего "репозитория")
     * @return Отсортированный по полю age список
     */
    @GetMapping("/sort")
    public List<User> sortUser(){
        return dataProcessingService.sortUserByAge(dataProcessingService.getUserRepository().getUserList());
    }

    /**
     * Метод фильтрует данные, исключая те экземпляры класса User, поле age которых совпадает с аргументом этого метода
     * @param age аргумент для поиска совпадающего по значению поля age класса User, в списке нашей "базы данных"
     * @return Отфильтрованный список
     */
    @GetMapping("/filter{age}")
    public List<User> filterUser(@PathVariable int age){
        List<User> userList = dataProcessingService.getUserRepository().getUserList();
        List<User> us = dataProcessingService.filterUserByAge(userList, age);
        us.forEach(System.out::print);// Метод "исклчает из списка" пользователя с индексов age
        return dataProcessingService.filterUserByAge(userList, age);
    }

    /**
     * Метод для нахождения среднего арифметического всех полей "age" всех экземпляров "User" в нашей "базе данных"
     * @return Среднее арифметическое всех полей "age"
     */
    @GetMapping("/calkulate")
    public double calkulateUser(){
        List<User> userList = dataProcessingService.getUserRepository().getUserList();
        return dataProcessingService.calkulateUserByAge(userList);
    }
}
