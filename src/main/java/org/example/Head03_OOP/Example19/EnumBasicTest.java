package org.example.Head03_OOP.Example19;

public class EnumBasicTest {
    public static void main(String[] args) {
        for (Level lvl : Level.values()) {
            System.out.println(lvl + " ordinal=" + lvl.ordinal());
        }
        Level today = Level.MEDIUM;
        System.out.println("name(): " + today.name());
    }
}
