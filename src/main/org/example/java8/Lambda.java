package org.example.java8;

import java.util.ArrayList;
import java.util.List;

interface MaxFinder {
    int findMax(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        MaxFinder maxFinder = (a, b) -> (a > b) ? a : b;
        System.out.println(maxFinder.findMax(5, 10));
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(10000);
        nums.forEach(num -> System.out.println(num * num));
    }

}
