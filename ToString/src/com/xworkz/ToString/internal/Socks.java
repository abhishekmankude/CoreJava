package com.xworkz.ToString.internal;

public class Socks {
    private String brand;
    private String color;
    private int price;

    public Socks(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Socks brand: " + brand + ", color: " + color + ", price: " + price;
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
            if(object instanceof Socks) {
                System.out.println("ref is Socks, will compare...");
                Socks socks = this;
                Socks socks1 = (Socks) object;
                if(socks.brand.equals(socks1.brand) && socks.color.equals(socks1.color) && socks.price == socks1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}