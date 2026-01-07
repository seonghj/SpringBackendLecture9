package org.example.Head03_OOP.Example23;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileErrorExample {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
