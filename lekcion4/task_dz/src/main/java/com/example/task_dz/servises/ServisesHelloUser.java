package com.example.task_dz.servises;

import com.example.task_dz.model.HelloUser;
import com.example.task_dz.model.User;
import org.springframework.stereotype.Service;

@Service
public class ServisesHelloUser {

    private HelloUser helloUser = new HelloUser();
    private User user = new User();
    public String helloUser(){
        return helloUser.getHelloUser();
    }
    public User getUser(){
        return this.user;
    }
    public void setUser(String name){
        user.setName(name);
    }
}
