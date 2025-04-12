package com.xworkz.ToString.internal;

public class Mirror {
    private String shape;
    private int height;
    private int price;

    public Mirror(String shape, int height, int price) {
        this.shape = shape;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mirror shape: " + shape + ", height: " + height + "cm, price: " + price;
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
            if(object instanceof Mirror) {
                System.out.println("ref is Mirror, will compare...");
                Mirror mirror = this;
                Mirror mirror1 = (Mirror) object;
                if(mirror.shape.equals(mirror1.shape) && mirror.height == mirror1.height && mirror.price == mirror1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}