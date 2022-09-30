package com.sirin.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GogTest {

    @Test
    void getName() {

        Dog dog = new Dog("sirin",2);

        assertEquals("sirin",dog.getName());
    }

    @Test
    void setName() {
        Dog dog = new Dog("sirin",2);
        dog.setName("Kuzya");

        assertEquals("sirin",dog.getName());
    }

    @Test
    void setNameIfIsEmpty() {
        Dog dog = new Dog("",2);
        dog.setName("Kuzya");

        assertEquals("Kuzya",dog.getName());
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }
}