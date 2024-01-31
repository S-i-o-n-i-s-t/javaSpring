package com.example.demo.servises;

import com.example.demo.domen.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServises {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        userRepository.save(new User(null, "name1", "email1"));
        userRepository.save(new User(null, "name2", "email2"));
        userRepository.save(new User(null, "name3", "email3"));
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id);
    }
}
