package com.sirin.domain;

public class Dog {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name.isEmpty()){
            this.name = name;
        }
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
