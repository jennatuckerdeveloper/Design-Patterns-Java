package com.codewithmost;

public class User {
    // Bad practice when you declare fields as public
    public String name;

    public User(String name, Integer age) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hi, my name is " + name);
    }

}
