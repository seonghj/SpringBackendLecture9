package org.example.Head04_JCF.Example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");

        Function<String, String> toUpperCase = new Function<String, String>() {
            @Override
            public String apply(String s){
                return s.toUpperCase();
            }
        };

        names.stream()
                .map(toUpperCase)
                .forEach(uppercase -> System.out.println("to upper case: " + uppercase));
    }
}
