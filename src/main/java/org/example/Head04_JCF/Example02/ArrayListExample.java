package org.example.Head04_JCF.Example02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println("After add: " + fruits);

        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit);

        fruits.remove(1);
        System.out.println("after remove index: 1 " + fruits);

        System.out.println("List size: " + fruits.size());

        fruits.clear();
        System.out.println("After clear: " + fruits);
    }
}
