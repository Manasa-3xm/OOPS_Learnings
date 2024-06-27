package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionalInteraceEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream().filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
        List<String> fruits = Arrays.asList("jamun", "jellyfruit", "jackfruit", "apple", "mango");
        //print all fruits start with j
        List<String> fruitsstartwithJ = fruits.stream().filter(fruit -> fruit.charAt(0) == 'j').collect(Collectors.toList());
        List<String> fruitsDouble = Arrays.asList("jamun", "jamun", "jellyfruit", "jackfruit", "jackfruit", "apple", "mango");
        Map<String, Long> fruitCount = fruitsDouble.stream().collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()));

        System.out.println(fruitsstartwithJ);
        fruitCount.forEach((fruit, count) -> System.out.println(fruit + ":" + count));
    }

}
