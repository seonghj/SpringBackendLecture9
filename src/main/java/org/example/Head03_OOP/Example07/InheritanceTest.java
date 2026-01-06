package org.example.Head03_OOP.Example07;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        u.printUserInfo();

        User u2 = new BusinessUser("U002", "Tom", "alice@example.com", "abc");
        u2.printUserInfo();
    }
}
