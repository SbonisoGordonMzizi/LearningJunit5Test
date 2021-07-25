package com.gordonmzizi;

import java.util.ArrayList;

public class Mathutils {

    public int add(int a, int b){
        return a + b;
    }
    public int substract(int a, int b){ return a - b; }
    public double divide(int a, int b){
        return a / b;
    }
    public double multiply(int a, int b){
        return a * b;
    }
    public ArrayList<String> users(String name1, String name2){
        ArrayList<String > names = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        return names;
    }
}
