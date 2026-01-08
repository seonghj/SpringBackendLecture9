package org.example.Head04_JCF.Example02;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("kim", 90);
        scores.put("lee", 85);
        scores.put("park", 95);
        System.out.println("after put: " + scores);

        scores.put("lee", 88);
        System.out.println("after updating 'Lee': " + scores);

        int parkScore = scores.get("park");
        System.out.println("park's score: " + parkScore);

        System.out.println("contains 'kim' ? " + scores.containsKey("Kim"));

        scores.remove("kim");
        System.out.println("after remove 'kim': " + scores);

        System.out.println("all keys: " + scores.keySet());

    }
}