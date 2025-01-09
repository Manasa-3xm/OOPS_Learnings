package org.example;

abstract class Abstract_Animal {
    abstract void makeSound();

    void eat1() {
        System.out.println("Animal is eating....");
    }

}

class Dog1 extends Abstract_Animal {

    @Override
    void makeSound() {
        System.out.println("bark/.....!");
    }
}
