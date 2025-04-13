package com.xworkz.ToString.internal;

public class IceCream {
    private String brand;
    private String flavour;


    public IceCream(String brand,String flavour){
        this.brand=brand;
        this.flavour=flavour;
    }

    @Override
    public String toString() {
        return "Icecream brand "+this.brand+" Icecream flavour "+this.flavour;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null) {
            System.out.println("ref is not null");
            if(object instanceof IceCream) {
                System.out.println("ref is IceCream, will compare...");
                IceCream ice = this;
                IceCream ice1 = (IceCream) object;
                if(ice.brand.equals(ice1.brand) && ice.flavour.equals(ice1.flavour)) {
                    return true;
                }
            }
        }
        return false;
    }
}