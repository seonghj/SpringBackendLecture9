package org.example.Head04_JCF.Example04;

import java.util.Arrays;
import java.util.List;

public class MapNamesExampleLambda {
    public static void main(String[] args){
        List<String> names = Arrays.asList("alice", "bob", "charlie");

        names.stream().map(s->s.toUpperCase())
                .forEach(uppercase->System.out.println("to upper case: " + uppercase));
    }
}
