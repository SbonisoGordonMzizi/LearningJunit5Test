package com.gordonmzizi.web;

import com.gordonmzizi.service.AuthenticationService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



class LoginControllerTest {
    private LoginController loginController;
    private AuthenticationService authenticationService;

    @BeforeEach
    public void setUp() {
        this.authenticationService = Mockito.mock(AuthenticationService.class); // mock object
        this.loginController = new LoginController(this.authenticationService); // system under test
    }

    @Test
    public void Testing_LoginController_userAuth_right_password() {
        //Arrange
           Mockito.when(this.authenticationService.Authenticate(Mockito.anyString(),Mockito.anyString())).thenReturn(true);
           String expected = "/Home.html";
        //Act
           String actaul = loginController.userAuth("Vice","vice12345");
        //Assert
        Assert.assertEquals(expected,actaul);
    }
    @Test
    public void Testing_LoginController_userAuth_wrong_password() {
        //Arrange
        Mockito.when(this.authenticationService.Authenticate(Mockito.anyString(),Mockito.anyString())).thenReturn(false);
        String expected = "/Login.html";
        //Act
        String actaul = loginController.userAuth("Vice","vice12345");
        //Assert
        Assert.assertEquals(expected,actaul);
    }
}