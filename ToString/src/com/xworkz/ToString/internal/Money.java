package com.xworkz.ToString.internal;

public class Money{
    private String bankName;
    private String location;
    private int atmId;

    public Money(String bankName, String location, int atmId) {
        this.bankName = bankName;
        this.location = location;
        this.atmId = atmId;
    }

    @Override
    public String toString() {
        return "ATM bank " + this.bankName + " location " + this.location + " ATM ID " + this.atmId;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
