package com.junit;

public class Arthemetic {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String getGreeting(String name) {
        if (name == null) return null;
        return "Hello, " + name;
    }
}
