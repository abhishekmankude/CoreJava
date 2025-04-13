package com.xworkz.ToString.internal;

public class Money {
    private String bankName;
    private String location;


    public Money(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;

    }


    @Override
    public String toString() {
        return "ATM bank: " + bankName + ", l ocation: " + location ;
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
            if(object instanceof Money) {
                System.out.println("ref is Money, will compare...");
                Money money = this;
                Money money1 = (Money) object;
                if(money.bankName.equals(money1.bankName) && money.location.equals(money1.location) ) {
                    return true;
                }
            }
        }
        return false;
    }
}