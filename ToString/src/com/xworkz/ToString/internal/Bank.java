package com.xworkz.ToString.internal;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Bank name: " + this.name + ", branch: ";
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
            if(object instanceof Bank) {
                System.out.println("ref is Bank, will compare...");
                Bank bank = this;
                Bank bank1 = (Bank) object;
                if(bank.name.equals(bank1.name)) {
                    return true;
                }
            }
        }
        return false;
    }
}