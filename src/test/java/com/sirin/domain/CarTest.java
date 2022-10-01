package com.sirin.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Audi", "AA 9999-07", 1991, "sirin");
    }

    @Test
    void getManufacturer() {
        assertEquals("Audi", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("AA 9999-07", car.getNumber());

    }

    @Test
    void setNumber() {
        car.setNumber("0000");
        assertEquals("0000", car.getNumber());
    }

    @Test
    void getYear() {

        assertEquals(1991, car.getYear());
    }

    @Test
    void getOwner() {

        assertEquals("sirin", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("qqq");
        assertEquals("qqq", car.getOwner());
    }

    @Test
    void getAllOwnersTeat(){
        assertArrayEquals(new String[]{"sirin"},car.getAllOwners().toArray());
    }

    @Test
    void getTwoOwnersTeat(){
        car.setOwner("qqq");
        assertArrayEquals(new String[]{"sirin","qqq"},car.getAllOwners().toArray());
    }

}