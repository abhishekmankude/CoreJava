package com.xworkz.ToString.internal;

public class ToyCar {
    private String color;
    private String brand;
    private int price;

    public ToyCar(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ToyCar color: " + color + ", brand: " + brand + ", price: " + price;
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
            if(object instanceof ToyCar) {
                System.out.println("ref is ToyCar, will compare...");
                ToyCar toyCar = this;
                ToyCar toyCar1 = (ToyCar) object;
                if(toyCar.color.equals(toyCar1.color) && toyCar.brand.equals(toyCar1.brand) && toyCar.price == toyCar1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}