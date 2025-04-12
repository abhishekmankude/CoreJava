package com.xworkz.ToString.internal;

public class Chappal {
    private String brand;
    private String size;
    private int price;

    public Chappal(String brand, String size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chappal brand: " + this.brand + ", size: " + this.size + ", price: " + this.price;
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
                if(chappal.brand.equals(chappal1.brand) &&
                        chappal.size.equals(chappal1.size) &&
                        chappal.price == chappal1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}