package com.example.taskDZ.services;

import com.example.taskDZ.domen.User;
import com.example.taskDZ.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataProcessingService {
    /**
     * Поле this класса, Экземпляр класса UserRepository
     */
    @Autowired
    UserRepository userRepository = new UserRepository();

    /**
     * Метод экземпляра клсса UserRepository, который хранит список экземпляров класса User
     * @return Возвращает this поле типа UserRepository
     */
    public UserRepository getUserRepository() {
        return userRepository;
    }

    /**
     * Метод сортировки списка экземпляров класса User
     * @param users список экземпляров класса User
     * @return Через stream API методом sorted(Comparator.comparing(User::getAge) - сортируем список по умолчанию (по возрастанию), по "возрасту" - getAge
     *          Методом collect(Collectors.toList()) преобразуем наш поток, в отсортированную коллекцию users
     */
    public List<User> sortUserByAge( List<User> users){
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
    }

    /**
     * Получаем нужный нам экземпляр User в составе коллекции List<User>
     * @param users Cписок экземпляров класса User
     * @param age Возрасть (age) интересующего экземпляра класса User
     * @return Через stream API методом filter(user -> user.getAge() > age) получем те экземпляры классов User, в которых поле age содержит параметр age
     *          Методом collect(Collectors.toList()) преобразуем наш поток, в отфильтрованную коллекцию users
     */
    public List<User> filterUserByAge( List<User> users, int age){
        return users.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    /**
     * Метод для получения среднеарифметического значения полей age в коллекции экземпляров класса User
     * @param users Cписок экземпляров класса User
     * @return Через stream API методом mapToInt(User::getAge) получем поток из "int" значений которые берутся из полей age экземпляров класса User в коллекции
     *          Методом average() получаем среднее значение всех чисел в потоке, или пустой необязательный параметр, если поток пуст.
     */
    public double calkulateUserByAge(List<User> users){
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }

    /**
     * Метод добавления экземпляров класса User в список поля userList класса UserRepository
     * @param user Экземпляр класса User
     */
    public void addUser(User user){
        userRepository.getUserList().add(user);
    }

}






























