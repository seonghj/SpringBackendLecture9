package org.example.Head04_JCF.Example02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("korea");
        countries.add("japan");
        countries.add("china");
        countries.add("korea");

        System.out.println("Contains 'japan' ? " + countries.contains("japan"));

        countries.remove("china");
        System.out.println("After remove 'china': "  + countries);

        System.out.println("Set Size: " + countries.size());


        countries.clear();
        System.out.println("After clear: " + countries);
    }
}
