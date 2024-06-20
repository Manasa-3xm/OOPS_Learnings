package org.example;

public class Overloading {
    //occurs when 2 or more methods in the same class have the same name but diff parameters
    //which is compile time polymorphism
    void display(int a) {
        System.out.println("Got integer data: " + a);
    }

    void display(String b) {
        System.out.println("Got String datab" + b);
    }


}
