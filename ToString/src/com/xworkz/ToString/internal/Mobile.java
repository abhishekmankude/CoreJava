package com.xworkz.ToString.internal;

public class Mobile {
    private String brand;
    private String model;
    private int price;

    public Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile brand: " + brand + ", model: " + model + ", price: " + price;
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
            if(object instanceof Mobile) {
                System.out.println("ref is Mobile, will compare...");
                Mobile mobile = this;
                Mobile mobile1 = (Mobile) object;
                if(mobile.brand.equals(mobile1.brand) && mobile.model.equals(mobile1.model) && mobile.price == mobile1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}