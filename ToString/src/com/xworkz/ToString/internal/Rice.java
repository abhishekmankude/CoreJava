package com.xworkz.ToString.internal;

public class Rice {
    private String type;
    private int quantityInKg;
    private int price;

    public Rice(String type, int quantityInKg, int price) {
        this.type = type;
        this.quantityInKg = quantityInKg;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rice type: " + type + ", quantity: " + quantityInKg + "kg, price: " + price;
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
            if(object instanceof Rice) {
                System.out.println("ref is Rice, will compare...");
                Rice rice = this;
                Rice rice1 = (Rice) object;
                if(rice.type.equals(rice1.type) && rice.quantityInKg == rice1.quantityInKg && rice.price == rice1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}