package com.gordonmzizi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class MathutilsTest {
    Mathutils mathutils;

    @BeforeEach
    void init(){
        mathutils = new Mathutils();
    }

    @Test
    void add() {
        int expected = 2;
        int actual = mathutils.add(1,1);
        assertEquals(expected,actual,"adding two value and return sum");
    }

    @Test
    @DisplayName("SubStract")
    void substract() {
        int expected = 3;
        int actual = mathutils.substract(4,1);
        assertEquals(expected,actual,"substract two value and return sum");
    }

    @Test
    void divide() {
        assertThrows(ArithmeticException.class,() -> mathutils.divide(10,0));
    }

    @Test
    void multiply() {
        int expected = 2;
        double actual = mathutils.multiply(2,1);
        assertEquals(expected,actual,"multiply two value and return sum");
    }

    @Test
    void ArrayTest(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Bob");
        expected.add("Vice");

        ArrayList<String> actual = mathutils.users("Bob","Vice");
        assertIterableEquals(expected,actual,"Check Two array for equality");
    }

    @Test
    public void testingMockito(){
        Calendar calendar = Mockito.mock(Calendar.class);
    }
}