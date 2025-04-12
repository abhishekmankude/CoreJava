package com.xworkz.ToString.internal;

public class IceCream {
    private String brand;
    private String flavour;
    private int cost;

    public IceCream(String brand,String flavour,int cost){
        this.brand=brand;
        this.flavour=flavour;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Icecream brand "+this.brand+" IceCream cost "+this.cost+" Icecream flavour "+this.flavour;
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
                if(ice.brand.equals(ice1.brand) && ice.flavour.equals(ice1.flavour) && ice.cost == ice1.cost) {
                    return true;
                }
            }
        }
        return false;
    }
}