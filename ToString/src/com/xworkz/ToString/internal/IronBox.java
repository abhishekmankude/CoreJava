package com.xworkz.ToString.internal;

public class IronBox {
    private String brand;
    private int wattage;
    private int price;

    public IronBox(String brand, int wattage, int price) {
        this.brand = brand;
        this.wattage = wattage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "IronBox brand " + this.brand + " wattage " + this.wattage + " price " + this.price;
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
            if(object instanceof IronBox) {
                System.out.println("ref is IronBox, will compare...");
                IronBox iron = this;
                IronBox iron1 = (IronBox) object;
                if(iron.brand.equals(iron1.brand) && iron.wattage == iron1.wattage && iron.price == iron1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}