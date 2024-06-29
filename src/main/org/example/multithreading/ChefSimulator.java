package org.example.multithreading;

public class ChefSimulator {
    //concurrency ->concurrency in Java refers to the ability of different parts or units
    // of a program
    // to execute independently but potentially simultaneously.
//It enables tasks to start, run, and complete in overlapping time periods, which can
// improve the overall throughput of the system. In Java, concurrency is typically
// achieved using threads.
// Each thread represents an independent flow of execution within a program.
    public static void main(String[] args) {
        Thread chef1 = new Thread(() -> {
            cookDish("Pizza");
        });
        Thread chef2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                cookDish("Pasta");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread chef3 = new Thread(() -> {
            cookDish("Biryani");
        });
        chef1.start();
//        chef1.interrupt();
        chef2.start();
        chef3.start();
    }

    private static void cookDish(String dishName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cooking " + dishName + " -Step" + i);
            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(dishName + " is ready!");
    }
}
