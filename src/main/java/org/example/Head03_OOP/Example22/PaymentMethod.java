package org.example.Head03_OOP.Example22;

public enum PaymentMethod {
    CREDIT_CARD("신용카드 결제"),
    ACCOUNT_TRANSFER("계좌 이체"),
    MOBILE_PAYMENT("모바일 결제");

    private final String displayName;

    PaymentMethod(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
