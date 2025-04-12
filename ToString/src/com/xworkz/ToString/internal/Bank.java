package com.xworkz.ToString.internal;

public class Bank {
    private String name;
    private String branch;
    private int balance;

    public Bank(String name, String branch, int balance) {
        this.name = name;
        this.branch = branch;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank name: " + this.name + ", branch: " + this.branch + ", balance: " + this.balance;
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
                if(bank.name.equals(bank1.name) && bank.branch.equals(bank1.branch) && bank.balance == bank1.balance) {
                    return true;
                }
            }
        }
        return false;
    }
}