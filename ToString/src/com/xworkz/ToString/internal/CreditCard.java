package com.xworkz.ToString.internal;

public class CreditCard {
    private String bankName;


    public CreditCard(String bankName, int cardNumber, int creditLimit) {
        this.bankName = bankName;

    }

    @Override
    public String toString() {
        return "CreditCard bank: " + this.bankName + ", card number: " ;
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
            if(object instanceof CreditCard) {
                System.out.println("ref is CreditCard, will compare...");
                CreditCard card = this;
                CreditCard card1 = (CreditCard) object;
                if(card.bankName.equals(card1.bankName)) {
                    return true;
                }
            }
        }
        return false;
    }
}