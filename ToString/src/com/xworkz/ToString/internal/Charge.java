package com.xworkz.ToString.internal;

public class Charge {
    private String type;
    private String company;
    private int capacity;

    public Charge(String type, String company, int capacity) {
        this.type = type;
        this.company = company;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Charge type: " + this.type + ", company: " + this.company + ", capacity: " + this.capacity + "V";
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
            if(object instanceof Charge) {
                System.out.println("ref is Charge, will compare...");
                Charge charge = this;
                Charge charge1 = (Charge) object;
                if(charge.type.equals(charge1.type) &&
                        charge.company.equals(charge1.company) &&
                        charge.capacity == charge1.capacity) {
                    return true;
                }
            }
        }
        return false;
    }
}