package org.example.Head04_JCF.Example05;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefDemo {
    public void printString(String s){
        System.out.println("string: " + s);
    }

    public static void main(String[] args) {
        InstanceMethodRefDemo demo = new InstanceMethodRefDemo();
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        list.forEach(demo::printString);
    }
}
