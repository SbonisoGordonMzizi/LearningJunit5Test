package com.gordonmzizi.repository;

import com.gordonmzizi.persistance.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String,User> user = new HashMap<>();

    public UserRepository(){
        user.put("Vice", new User("Vice","vice12345"));
        user.put("Bob", new User("Bob","bob12345"));
    }
    public User findUserByName(String userName){
        return user.get(userName);
    }
}
