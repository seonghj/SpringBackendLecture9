package org.example.Head04_JCF.Example04;

import java.util.HashMap;
import java.util.Map;

public class MapEntryTransfomationExampleLambda {
    public static void main(String[] args){
        Map<String, Integer> scores = new HashMap<>();
        scores.put("kim", 90);
        scores.put("lee", 85);
        scores.put("park", 92);

        scores.entrySet().stream()
                .map(e->e.getKey().toUpperCase() + ": " + e.getValue())
                .forEach(result -> System.out.println("student info (upperCase): " + result));
    }
}
