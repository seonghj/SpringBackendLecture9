package org.example.Head04_JCF.Example07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReducingExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Collector");

        String joined = words.stream()
                .collect(Collectors.reducing(
                        "",
                        (a,b) -> a.isEmpty() ? b : a + " - " + b
                ));

        System.out.println("Joined: " + joined);
    }
}
