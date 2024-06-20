package org.example;

public class Dog extends Animal {
    public void eat() {
        super.eat();
        System.out.println("dog eats dog food");
        //sub class can override methods from the subclass allowing polymorphic behavior
    }

    static class Cat extends Overriding {
        void makeSound() {
            System.out.println("Meow Meow");
        }


    }

    static class Bird extends Overriding {
        public void makeSound() {
            super.makeSound();
        }

    }
}
