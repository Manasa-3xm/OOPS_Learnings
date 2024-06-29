package org.example.multithreading;

public class RunnableExample {
    ///how to create a thread -> extend thraed , runnable
    //ifwe use extend the thread -> we cannot extend any other class it doesnt
    //support multiple inheritence . but with runnable interface , we can support it .
    //Using runnable will give you an object that can be shared amongst multiple threads.
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            Thread obj = new Thread(new MultiThread1());
            obj.start();
        }
    }

}

class MultiThread1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("exception ");
        }
    }
}