package com.xworkz.ToString.internal;

public class Stand {
    private String type;
    private String color;
    private int price;

    public Stand(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stand type: " + type + ", color: " + color + ", price: ₹" + price;
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
            if(object instanceof Stand) {
                System.out.println("ref is Stand, will compare...");
                Stand stand = this;
                Stand stand1 = (Stand) object;
                if(stand.type.equals(stand1.type) && stand.color.equals(stand1.color) && stand.price == stand1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}