package org.example.Head04_JCF.Example05;

@FunctionalInterface
interface PersonFactory {
    Person create(String name, int age);
}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        PersonFactory factory2 = Person::new;

        Person p = factory2.create("kim", 25);
        System.out.println("created person -> name: " + p.name + ", age: " + p.age);
    }
}
