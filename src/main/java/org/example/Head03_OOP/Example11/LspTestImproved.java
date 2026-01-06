package org.example.Head03_OOP.Example11;

public class LspTestImproved {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rect.getArea());

        Shape square = new Square(5);
        System.out.println("Square area: " + square.getArea());
    }
}
