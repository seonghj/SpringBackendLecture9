package org.example.Head03_OOP.Example22;

public class PaymentMethodTest {
    public static void main(String[] args) {
        for(PaymentMethod p : PaymentMethod.values()){
            System.out.println(p.name() + " - " + p.getDisplayName());
        }

        System.out.print("\n");

        PaymentMethod method = PaymentMethod.CREDIT_CARD;
        switch (method) {
            case CREDIT_CARD: {
                System.out.println("신용카드 결제 선택");
            }break;
            case ACCOUNT_TRANSFER: {
                System.out.println("계좌 이체 선택");
            }break;
            case MOBILE_PAYMENT: {
                System.out.println("모바일 결제 선택");
            }break;
        }
    }
}
