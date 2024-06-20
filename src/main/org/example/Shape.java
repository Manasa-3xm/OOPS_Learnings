package org.example;

public interface Shape {
    void draw();
}

//many forms acheived by method overloading
//super keyword is used within subclass to refer to supper class , tu invoke thesuperclass's methods and methods .especially overriding,
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drwing a circle");
    }

    static class Rectangle implements Shape {

        @Override
        public void draw() {
            System.out.println("Drawing a recangle");
        }
    }

}
