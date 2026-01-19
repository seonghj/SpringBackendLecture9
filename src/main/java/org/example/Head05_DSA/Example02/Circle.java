package org.example.Head05_DSA.Example02;

public class Circle implements Shape{
    private double radius;
    public Circle(double radius) { this.radius = radius; }

    // Shape의 인터페이스 getArea() 구현
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
