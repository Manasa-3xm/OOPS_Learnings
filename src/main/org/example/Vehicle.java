package org.example;

public abstract class Vehicle {
    //abstraction
    //abstraction ->focusing on what an object does instead of how it does
//how to acheive -> using abstract classes and interfaces
    public abstract void move();
}

class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("Car is moving ...");
    }
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("bike is moving");
    }
}

