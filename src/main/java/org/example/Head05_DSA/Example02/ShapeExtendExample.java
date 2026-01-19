package org.example.Head05_DSA.Example02;

public class ShapeExtendExample {
    public static void main(String[] args){
        ShapeContainer<Circle> container = new ShapeContainer<>();
        container.add(new Circle(5.0));
        container.add(new Circle(10.0));
        System.out.println(container.totalArea());

    }
}
