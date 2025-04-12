package com.xworkz.ToString.internal;

public class Watch {
    private String brand;
    private String style;
    private int price;

    public Watch(String brand, String style, int price) {
        this.brand = brand;
        this.style = style;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch brand: " + brand + ", style: " + style + ", price: " + price;
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
            if(object instanceof Watch) {
                System.out.println("ref is Watch, will compare...");
                Watch watch = this;
                Watch watch1 = (Watch) object;
                if(watch.brand.equals(watch1.brand) && watch.style.equals(watch1.style) && watch.price == watch1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}