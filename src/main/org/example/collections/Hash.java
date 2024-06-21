package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + ",Value: " + entry.getValue());
        }
//ArrayList -> random access && linkedlist -> frequent add/remove operation
        //considering thread safety , collections from java.util -> not thread safe && java.util.concurrent

    }
}
