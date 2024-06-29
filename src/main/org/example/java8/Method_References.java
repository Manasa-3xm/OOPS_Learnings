package org.example.java8;

import java.util.Arrays;
import java.util.List;

public class Method_References {
    ///Method References: Method references provide a way to refer to methods or
    // constructors without invoking them.
    // They are shorthand notations for lambda expressions.

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println);

// Using lambda expression
        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));

// Using method reference
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        // Using lambda expression
        Converter<String, Integer> converter1 = s -> Integer.valueOf(s);
        System.out.println(converter1);
        // Using method reference
        Converter<String, Integer> converter2 = Integer::valueOf;
        System.out.println(converter2);

// Using lambda expression
        names.sort((s1, s2) -> s1.compareTo(s2));

// Using method reference
        names.sort(String::compareTo);
        System.out.println(names);
        int[] numbers = {5, 2, 9, 1, 5};
        Arrays.parallelSort(numbers);
        System.out.println(numbers.toString());
    }

    // Example of a functional interface
    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }


}
