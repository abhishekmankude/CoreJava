package com.xworkz.ToString.internal;

public class Shoe {
    private String brand;
    private int size;
    private int price;

    public Shoe(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoe brand: " + brand + ", size: " + size + ", price: " + price;
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
            if(object instanceof Shoe) {
                System.out.println("ref is Shoe, will compare...");
                Shoe shoe = this;
                Shoe shoe1 = (Shoe) object;
                if(shoe.brand.equals(shoe1.brand) && shoe.size == shoe1.size && shoe.price == shoe1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}