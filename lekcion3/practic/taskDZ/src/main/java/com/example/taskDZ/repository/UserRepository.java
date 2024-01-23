package com.example.taskDZ.repository;

import com.example.taskDZ.domen.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    /**
     * Поле this класса для хранения списка экземпляров класса User
     */
    private List<User> userList = new ArrayList<>();

    /**
     * Мутод возвращающий значение поля userList
     * @return значение поля userList
     */
    public List<User> getUserList() {
        return userList;
    }

    /**
     * Метод присваивающий полю userList значение аргумента метода
     * @param userList Тип аргумента List<User>
     */
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

}
