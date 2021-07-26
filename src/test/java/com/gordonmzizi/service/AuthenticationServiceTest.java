package com.gordonmzizi.service;

import com.gordonmzizi.persistance.User;
import com.gordonmzizi.repository.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AuthenticationServiceTest {
    private UserRepository userRepository;
    private AuthenticationService authenticationService;

    @BeforeEach
    public void setUp() {
        this.userRepository = Mockito.mock(UserRepository.class);
        this.authenticationService = new AuthenticationService(this.userRepository);
    }

    @Test
    public void Testing_AuthenticationService_Authenticate_right_password() {
        //Arrange
           Mockito.when(this.userRepository.findUserByName(Mockito.anyString())).thenReturn(new User("Vice","vice12345"));
           boolean expected = true;
        //Act
           boolean actual = this.authenticationService.Authenticate("Vice","vice12345");
        //Assert
        Assert.assertNotNull(actual);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void Testing_AuthenticationService_Authenticate_wrong_password() {
        //Arrange
        Mockito.when(this.userRepository.findUserByName(Mockito.anyString())).thenReturn(new User("Vice","vice12345"));
        boolean expected = false;
        //Act
        boolean actual = this.authenticationService.Authenticate("Vice","wrongPassword");
        //Assert
        Assert.assertNotNull(actual);
        Assert.assertEquals(expected,actual);

    }
}