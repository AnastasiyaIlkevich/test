package com.sirin.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GogTest {

    Dog dog;

    @BeforeEach
    void paramData(){
        dog = new Dog("sirin",2);
    }


    @Test
    void getName() {
        assertEquals("sirin",dog.getName());
    }

    @Test
    void setName() {
        dog.setName("Kuzya");

        assertEquals("sirin",dog.getName());
    }

    @Test
    void setNameIfIsEmpty() {
        Dog dog = new Dog("",2);
        dog.setName("Kuzya");

        assertEquals("Kuzya",dog.getName());
    }
}