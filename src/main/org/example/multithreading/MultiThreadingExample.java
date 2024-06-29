package org.example.multithreading;

public class MultiThreadingExample {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultiThread multiThread = new MultiThread();
            multiThread.start();
        }
    }


}

class MultiThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exceptio is caught");
        }
    }
}