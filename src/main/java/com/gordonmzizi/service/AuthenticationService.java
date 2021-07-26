package com.gordonmzizi.service;

import com.gordonmzizi.persistance.User;
import com.gordonmzizi.repository.UserRepository;

public class AuthenticationService {
    private UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean Authenticate(String userName, String password){
        User user = userRepository.findUserByName(userName);
        if(user.getPassword().equals(password)){
            return true;
        }else {
            return false;
        }
    }
}
