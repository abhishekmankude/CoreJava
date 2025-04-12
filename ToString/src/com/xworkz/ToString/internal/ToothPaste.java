package com.xworkz.ToString.internal;

public class ToothPaste {
    private String brand;
    private String flavor;
    private int price;

    public ToothPaste(String brand, String flavor, int price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toothpaste brand: " + brand + ", flavor: " + flavor + ", price: " + price;
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
            if(object instanceof ToothPaste) {
                System.out.println("ref is ToothPaste, will compare...");
                ToothPaste paste = this;
                ToothPaste paste1 = (ToothPaste) object;
                if(paste.brand.equals(paste1.brand) && paste.flavor.equals(paste1.flavor) && paste.price == paste1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}