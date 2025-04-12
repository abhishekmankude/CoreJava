package com.xworkz.ToString.internal;

public class Chapati {
    private String flourType;
    private int quantity;
    private int price;

    public Chapati(String flourType, int quantity, int price) {
        this.flourType = flourType;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chapati flour type: " + this.flourType + ", quantity: " + this.quantity + ", price: " + this.price;
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null) {
            System.out.println("ref is not null");
            if(object instanceof Chapati) {
                System.out.println("ref is Chapati, will compare...");
                Chapati chapati = this;
                Chapati chapati1 = (Chapati) object;
                if(chapati.flourType.equals(chapati1.flourType) &&
                        chapati.quantity == chapati1.quantity &&
                        chapati.price == chapati1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}