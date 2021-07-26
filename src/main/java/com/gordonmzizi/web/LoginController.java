package com.gordonmzizi.web;

import com.gordonmzizi.service.AuthenticationService;

public class LoginController {
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public String userAuth(String userName, String password){
        if(authenticationService.Authenticate(userName,password)){
            return "/Home.html";
        }else{
            return "/Login.html";
        }
    }
}
