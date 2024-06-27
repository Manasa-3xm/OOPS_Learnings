package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

interface MaxFinder {
    int findMax(int a, int b);
}

public class Lambda {
    public static void main(String[] args) throws Exception {
        MaxFinder maxFinder = (a, b) -> (a > b) ? a : b;
        System.out.println(maxFinder.findMax(5, 10));
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(10000);
        nums.forEach(num -> System.out.println(num * num));
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from run method");
            }
        };
        Runnable runnable1 = () -> System.out.println("hello ffrom lambda");
        runnable.run();
        runnable1.run();
        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {
                return nums;
            }
        };
        System.out.println(callable.call());
        Callable callable1 = () -> nums.add(13);
        System.out.println(callable1.call().toString());
    }

}
