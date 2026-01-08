package org.example.Head04_JCF.Example04;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("kim", 90);
        scores.put("lee", 85);
        scores.put("park", 92);

        Function<Map.Entry<String, Integer>, String> entryToString =
                new Function<Map.Entry<String, Integer>, String>() {
                    @Override
                    public String apply(Map.Entry<String, Integer> e) {
                        return e.getKey().toUpperCase() +": " + e.getValue();
                    }
                };

        scores.entrySet().stream()
                .map(entryToString)
                .forEach(result -> System.out.println("Student Info (upperCase): " + result));
    }
}
