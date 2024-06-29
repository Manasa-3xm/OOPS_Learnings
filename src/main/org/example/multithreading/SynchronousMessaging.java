package org.example.multithreading;

public class SynchronousMessaging {
    public static void main(String[] args) {
        Friend alice = new Friend("Alice");
        Friend bob = new Friend("Bob");
        alice.sendMessage("Hey Bob,how are you ?");
        bob.sendResponse("Hi ALice,I'm good!");
        alice.sendMessage("Want to grab lunch today?");
        bob.sendResponse("sure, what time?");
    }
}
