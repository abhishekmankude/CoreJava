package com.xworkz.ToString.internal;

public class Mouse {
    private String brand;
    private String type;
    private int price;

    public Mouse(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse brand: " + brand + ", type: " + type + ", price: " + price;
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
            if(object instanceof Mouse) {
                System.out.println("ref is Mouse, will compare...");
                Mouse mouse = this;
                Mouse mouse1 = (Mouse) object;
                if(mouse.brand.equals(mouse1.brand) && mouse.type.equals(mouse1.type) && mouse.price == mouse1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}