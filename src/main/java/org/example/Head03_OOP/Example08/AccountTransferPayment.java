package org.example.Head03_OOP.Example08;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체: " + amount + "원 결제 처리.");
    }
}
