package org.example.Head03_OOP.Example14;

public class Outer {
    private int instanceValue = 50;

    public class Inner{
        public void printInstanceValue() {
            System.out.println("Outer instanceValue: " + instanceValue);
        }
    }
}
