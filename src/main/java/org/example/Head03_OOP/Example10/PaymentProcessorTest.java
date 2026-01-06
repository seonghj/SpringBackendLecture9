package org.example.Head03_OOP.Example10;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        Payment[] payments = {
                new AccountTransferPayment(),
                new CreditCardPayment(),
                new MobilePayment()
        };
        int[] amounts = {30000, 20000, 100000};
        int idx = 0;
        for (Payment p : payments){
            p.pay(amounts[idx++]);
        }
    }
}