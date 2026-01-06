package org.example.Head03_OOP.Example08;

public class PolymorphismTest {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.processPayment(new CreditCardPayment(), 10000);
        service.processPayment(new AccountTransferPayment(), 20000);
        double[] paymentAmounts = new double[] {
                30000,
                70000
        };
        Payment[] payments = new Payment[]
                {
                        new CreditCardPayment(),
                        new AccountTransferPayment(),
                };
        for(Payment p : payments) {
            if (p instanceof CreditCardPayment){
                service.processPayment(p,paymentAmounts[0]);
            } else if(p instanceof AccountTransferPayment) {
                service.processPayment(p,paymentAmounts[1]);
            }
        }
    }
}
