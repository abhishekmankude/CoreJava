package com.xworkz.ToString.internal;

public class SunGlasses {
    private String brand;
    private String frameColor;
    private int price;

    public SunGlasses(String brand, String frameColor, int price) {
        this.brand = brand;
        this.frameColor = frameColor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sunglasses brand: " + brand + ", frame color: " + frameColor + ", price: " + price;
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
            if(object instanceof SunGlasses) {
                System.out.println("ref is SunGlasses, will compare...");
                SunGlasses glasses = this;
                SunGlasses glasses1 = (SunGlasses) object;
                if(glasses.brand.equals(glasses1.brand) && glasses.frameColor.equals(glasses1.frameColor) && glasses.price == glasses1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}