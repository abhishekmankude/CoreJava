package com.xworkz.ToString.internal;

public class Mirror {
    private String shape;
    private int height;


    public Mirror(String shape, int height, int price) {
        this.shape = shape;
        this.height = height;

    }

    public Mirror(String round, int height) {
    }

    @Override
    public String toString() {
        return "Mirror shape: " + shape + ", height: " + height;
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
                if(mirror.shape.equals(mirror1.shape) && mirror.height == mirror1.height ) {
                    return true;
                }
            }
        }
        return false;
    }
}