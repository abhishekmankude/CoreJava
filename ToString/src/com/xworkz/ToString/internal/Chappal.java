package com.xworkz.ToString.internal;

public class Chappal {
    private String brand;

    public Chappal(String brand) {
        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Chappal brand: " + this.brand ;
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
            if(object instanceof Chappal) {
                System.out.println("ref is Chappal, will compare...");
                Chappal chappal = this;
                Chappal chappal1 = (Chappal) object;
                if(chappal.brand.equals(chappal1.brand) ) {
                    return true;
                }
            }
        }
        return false;
    }
}