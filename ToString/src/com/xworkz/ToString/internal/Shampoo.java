package com.xworkz.ToString.internal;

public class Shampoo {
    private String brand;
    private int volume;
    private String fragrance;

    public Shampoo(String brand, int volume, String fragrance) {
        this.brand = brand;
        this.volume = volume;
        this.fragrance = fragrance;
    }

    @Override
    public String toString() {
        return "Shampoo brand: " + brand + ", volume: " + volume + "ml, fragrance: " + fragrance;
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
            if(object instanceof Shampoo) {
                System.out.println("ref is Shampoo, will compare...");
                Shampoo shampoo = this;
                Shampoo shampoo1 = (Shampoo) object;
                if(shampoo.brand.equals(shampoo1.brand) && shampoo.volume == shampoo1.volume && shampoo.fragrance.equals(shampoo1.fragrance)) {
                    return true;
                }
            }
        }
        return false;
    }
}