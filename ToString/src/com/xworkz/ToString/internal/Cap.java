package com.xworkz.ToString.internal;

public class Cap {
    private String color;
    private String brand;
    private int price;

    public Cap(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cap color: " + this.color + ", brand: " + this.brand + ", price: " + this.price;
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
            if(object instanceof Cap) {
                System.out.println("ref is Cap, will compare...");
                Cap cap = this;
                Cap cap1 = (Cap) object;
                if(cap.color.equals(cap1.color) &&
                        cap.brand.equals(cap1.brand) &&
                        cap.price == cap1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}