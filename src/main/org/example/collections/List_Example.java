package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class List_Example {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Guava");
//        for(String fruit:fruits){
//            System.out.println(fruit);
//        }
        //ArraysList -> resizable array implementation of the   List interface
        //dynamic size and ability to access elements efficiently
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Chiku");
        fruitsList.add(1, "Grape");

        for (String fruit : fruits) {
            fruitsList.add(fruit);

            System.out.println(fruitsList);
        }
        fruitsList.remove(1);
        System.out.println(fruitsList.lastIndexOf("Guava"));
        System.out.println(fruitsList.get(3));
        System.out.println(fruitsList.contains(fruits));
    }
//list vs set -> ordered vs unordered
    //allows duplicate vs doesnt allow duplicate
    //mulple nulls can be stored vs null element can store only one.
    //
}
