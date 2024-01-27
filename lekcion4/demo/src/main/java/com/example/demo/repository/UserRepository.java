package com.example.demo.repository;

import com.example.demo.domen.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class UserRepository {
    private Map<Long, User> users = new ConcurrentHashMap<>();
    private AtomicLong counter = new AtomicLong();
    public List<User> findAll(){
        return new ArrayList<>(users.values());// заполняем лист всеми значениями Map
    }
    public User findById(Long id){
        return users.get(id);
    }
    public User save(User user){
        if (user.getId() == null){
            user.setId(counter.incrementAndGet());// увеличивает счетчик и возвращает данные
        }
        users.put(user.getId(), user);
        return user;
    }

}
