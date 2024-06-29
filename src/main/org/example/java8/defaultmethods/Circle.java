package org.example.java8.defaultmethods;

import java.util.Optional;

interface Resizable {
    default void resize(double percentage) {
        System.out.println("Resiable shape by " + percentage + "%");
    }

}

public class Circle implements Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] main) {

        Circle circle = new Circle(5.9);
        circle.resize(50.0);
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        rectangle.resize(35.0);

        //Optional
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> optionalWithValue = Optional.of("hello world");
        Optional<String> optionalWithNullableValue = Optional.ofNullable(null);
        System.out.println(emptyOptional);
        System.out.println(optionalWithValue);
        System.out.println(optionalWithNullableValue);
        Optional<String> optional = Optional.of("Hello");
        if (optional.isPresent()) {
            System.out.println(optional.get()); // prints "Hello"
        }

        optional.ifPresent(value -> System.out.println("Value present: " + value)); // prints "Value present: Hello"

        String valueOrDefault = optional.orElse("Default Value"); // returns "Hello"
//In traditional Java programming, methods often return null to indicate
// that no value is present. This can lead to NullPointerException errors if
// not handled properly. Optional provides a way to
// explicitly state if a value is present or absent, without using null.
        String name = "manasa";
        Optional<String> optionalName = Optional.ofNullable(name);
//if string is null wont print anything
        if (optionalName.isPresent()) {
            System.out.println(optionalName.get()); // does not print anything since name is null
        }

    }

    static class Rectangle implements Resizable {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
    }


}
