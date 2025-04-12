package com.xworkz.ToString.internal;

public class Pencil {
    private String brand;
    private String type;
    private int price;

    public Pencil(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pencil brand: " + brand + ", type: " + type + ", price: " + price;
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
            if(object instanceof Pencil) {
                System.out.println("ref is Pencil, will compare...");
                Pencil pencil = this;
                Pencil pencil1 = (Pencil) object;
                if(pencil.brand.equals(pencil1.brand) && pencil.type.equals(pencil1.type) && pencil.price == pencil1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}