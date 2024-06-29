package org.example.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AsynchronousExample {
    public static void main(String[] args) {
        Friend alice = new Friend("Alice");
        Friend bob = new Friend("Bob");
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            alice.sendMessage("Hi bob,How are you?");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bob.sendResponse("Hi Alic, I'mGood");

        });
        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            alice.sendMessage("Want to grab lunch today?");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bob.sendResponse("sure, what time?");

        });
        CompletableFuture.allOf(future1, future2).join();
        System.out.println("All msgs sent and responses received.");
    }
}
