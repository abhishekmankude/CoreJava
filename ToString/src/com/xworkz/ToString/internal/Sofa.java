package com.xworkz.ToString.internal;

public class Sofa {
    private String material;
    private int seats;
    private int price;

    public Sofa(String material, int seats, int price) {
        this.material = material;
        this.seats = seats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sofa material: " + material + ", seats: " + seats + ", price: " + price;
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
            if(object instanceof Sofa) {
                System.out.println("ref is Sofa, will compare...");
                Sofa sofa = this;
                Sofa sofa1 = (Sofa) object;
                if(sofa.material.equals(sofa1.material) && sofa.seats == sofa1.seats && sofa.price == sofa1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}