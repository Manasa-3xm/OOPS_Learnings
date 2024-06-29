package org.example.multithreading;

public class Friend {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println(name + "sends : " + message);
    }

    public void sendResponse(String response) {
        System.out.println(name + "sends : " + response);
    }
}
