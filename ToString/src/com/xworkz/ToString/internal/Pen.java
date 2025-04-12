package com.xworkz.ToString.internal;

public class Pen {
    private String brand;
    private String inkColor;
    private int price;

    public Pen(String brand, String inkColor, int price) {
        this.brand = brand;
        this.inkColor = inkColor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen brand: " + brand + ", ink color: " + inkColor + ", price: " + price;
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
            if(object instanceof Pen) {
                System.out.println("ref is Pen, will compare...");
                Pen pen = this;
                Pen pen1 = (Pen) object;
                if(pen.brand.equals(pen1.brand) && pen.inkColor.equals(pen1.inkColor) && pen.price == pen1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}