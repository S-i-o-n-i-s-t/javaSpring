package com.example.taskDZ.services;

import com.example.taskDZ.domen.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    //region Поля класса
    /**
     * Поле класса UserService
     */
    UserService userService = new UserService();
    /**
     * Поле класса DataProcessingService
     */
    @Autowired
    DataProcessingService dataProcessingService = new DataProcessingService();
    /**
     * Поле класса NotificationService
     */
    NotificationService notificationService = new NotificationService();
    //endregion

    //region Методы класса
    /**
     * Метод инициализирующий класс User, через поле класса UserService и его метода createUser()
     * и добавляющего его в экземпляр класса UserRepository (нашу базу данных)
     * @param user Экземпляр класса User
     */
    public void processRegistration(User user){
        userService.createUser(user.getName(), user.getEmail(), user.getAge());
        dataProcessingService.addUser(user);
        notificationService.notificationUser(user);
    }

    //endregion

    //region Геттеры/Сеттеры

    /**
     * Метод считывающий поле UserService UserService
     * @return Экземпляр класса UserService
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * Метод присваивающий значение аргумента полю UserService
     * @param userService Экземпляр класса UserService
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Метод считывающий поле DataProcessingService
     * @return Экземпляр класса DataProcessingService
     */
    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    /**
     * Метод присваивающий значение аргумента полю DataProcessingService
     * @param dataProcessingService Экземпляр класса DataProcessingService
     */
    public void setDataProcessingService(DataProcessingService dataProcessingService) {
        this.dataProcessingService = dataProcessingService;
    }

    /**
     * Метод считывающий поле NotificationService
     * @return Экземпляр класса NotificationService
     */
    public NotificationService getNotificationService() {
        return notificationService;
    }

    /**
     * Метод присваивающий значение аргумента полю NotificationService
     * @param notificationService Экземпляр класса NotificationService
     */
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    //endregion
}
