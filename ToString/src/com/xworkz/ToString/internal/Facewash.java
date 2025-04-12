package com.xworkz.ToString.internal;

public class Facewash {
    private String brand;
    private int volume;
    private int price;

    public Facewash(String brand, int volume, int price) {
        this.brand = brand;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Facewash brand: " + this.brand + ", volume: " + this.volume + "ml, price: " + this.price;
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
            if(object instanceof Facewash) {
                System.out.println("ref is Facewash, will compare...");
                Facewash facewash = this;
                Facewash facewash1 = (Facewash) object;
                if(facewash.brand.equals(facewash1.brand) &&
                        facewash.volume == facewash1.volume &&
                        facewash.price == facewash1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}