package org.example.Head03_OOP.Example03;

public class Order {
    private String orderID;
    private boolean isPaid;

    public Order(){
        this.orderID = "NONE";
        this.isPaid = false;
    }


    public Order(String orderID, boolean isPaid){
        this.orderID = orderID;
        this.isPaid = isPaid;
    }
    // getter or setter

    public String getOrderID(){
        return this.orderID;
    }

    public boolean getPaid(){
        return this.isPaid;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
