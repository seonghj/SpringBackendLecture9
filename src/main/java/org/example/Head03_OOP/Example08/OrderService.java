package org.example.Head03_OOP.Example08;

public class OrderService {
    public void processPayment(Payment method, double amount) {
        method.pay(amount);
    }
}

