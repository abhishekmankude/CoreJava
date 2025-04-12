package com.xworkz.ToString.internal;

public class HeadPhone {
    private String brand;
    private String type;
    private int price;

    public HeadPhone(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "HeadPhone brand: " + this.brand + ", type: " + this.type + ", price: " + this.price;
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
            if(object instanceof HeadPhone) {
                System.out.println("ref is HeadPhone, will compare...");
                HeadPhone headPhone = this;
                HeadPhone headPhone1 = (HeadPhone) object;
                if(headPhone.brand.equals(headPhone1.brand) &&
                        headPhone.type.equals(headPhone1.type) &&
                        headPhone.price == headPhone1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}