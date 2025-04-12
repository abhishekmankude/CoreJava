package com.xworkz.ToString.internal;

public class Guitar {
    private String type;
    private String brand;
    private int price;

    public Guitar(String type, String brand, int price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Guitar type: " + this.type + ", brand: " + this.brand + ", price: " + this.price;
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
            if(object instanceof Guitar) {
                System.out.println("ref is Guitar, will compare...");
                Guitar guitar = this;
                Guitar guitar1 = (Guitar) object;
                if(guitar.type.equals(guitar1.type) &&
                        guitar.brand.equals(guitar1.brand) &&
                        guitar.price == guitar1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}