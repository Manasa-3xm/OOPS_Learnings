package org.example.multithreading;

public class Print1to100 {
    private static final Object lock = new Object();
    //use synchronized blocks or lock interfaces
    //to coordinates the o/p between the 2 theads.
    private static int number = 1;
    private static int MAX_NUMBER = 100;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintTask(1));
        Thread thread2 = new Thread(new PrintTask(2));
        thread1.start();
        thread2.start();

    }

    static class PrintTask implements Runnable {
        private int threadId;

        public PrintTask(int threadId) {
            this.threadId = threadId;
        }

        @Override
        public void run() {
            while (number <= MAX_NUMBER) {
                synchronized (lock) {
                    if ((number % 2 == 1 && threadId == 1) || (number % 2 == 0 && threadId == 2)) {
                        System.out.println("Thread" + threadId + ":" + number);
                        number++;
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
