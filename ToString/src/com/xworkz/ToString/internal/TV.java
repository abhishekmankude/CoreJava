package com.xworkz.ToString.internal;

public class TV {
    private String brand;
    private int size;
    private int cost;

    public TV(String brand, int size, int cost) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "TV brand: " + brand + ", size: " + size + " inches, cost: " + cost;
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
            if(object instanceof TV) {
                System.out.println("ref is TV, will compare...");
                TV tv = this;
                TV tv1 = (TV) object;
                if(tv.brand.equals(tv1.brand) && tv.size == tv1.size && tv.cost == tv1.cost) {
                    return true;
                }
            }
        }
        return false;
    }
}