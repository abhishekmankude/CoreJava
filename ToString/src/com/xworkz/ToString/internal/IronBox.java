package com.xworkz.ToString.internal;

public class IronBox {
    private String brand;
    private int wattage;


    public IronBox(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;

    }

    @Override
    public String toString() {
        return "IronBox brand " + this.brand + " wattage " + this.wattage ;
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
                if(iron.brand.equals(iron1.brand) && iron.wattage == iron1.wattage ) {
                    return true;
                }
            }
        }
        return false;
    }
}