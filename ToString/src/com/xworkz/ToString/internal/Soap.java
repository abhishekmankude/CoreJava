package com.xworkz.ToString.internal;

public class Soap {
    private String brand;
    private String type;
    private int price;

    public Soap(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Soap brand: " + brand + ", type: " + type + ", price: " + price;
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
            if(object instanceof Soap) {
                System.out.println("ref is Soap, will compare...");
                Soap soap = this;
                Soap soap1 = (Soap) object;
                if(soap.brand.equals(soap1.brand) && soap.type.equals(soap1.type) && soap.price == soap1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}