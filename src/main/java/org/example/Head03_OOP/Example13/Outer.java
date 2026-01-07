package org.example.Head03_OOP.Example13;

public class Outer {
    private static int staticValue = 100;
    private int instanceValue = 50;

    public static class StaticNested{
        public void printValues(){
            System.out.println("Outer.staticValue: " + staticValue);
        }
    }
}
