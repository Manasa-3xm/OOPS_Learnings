package org.example.multithreading;

import java.util.Arrays;

public class ParallelProcessing {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers).forEach(num -> {
            try {
                process(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Arrays.stream(numbers).parallel().forEach(num -> {
            try {
                process(num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public static void process(int num) throws InterruptedException {
        System.out.println("Processing " + num + " on thread" + Thread.currentThread().getId());
        Thread.sleep(1000);
    }

}
