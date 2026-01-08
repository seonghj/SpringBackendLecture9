package org.example.Head04_JCF.Example06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        String ret = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Formatted result: " + ret);
    }
}
