package com.xworkz.ToString.internal;

public class Malleshwaram {
    private String shop;
    private String purchace;
    private int dressCost;

    public Malleshwaram(String shop, String purchace, int dressCost) {
        this.dressCost = dressCost;
        this.shop = shop;
        this.purchace = purchace;
        System.out.println("No arg const of Malleshwaram");
    }

    @Override
    public String toString() {
        return "Shop :" + this.shop + ", Purchase :" + this.purchace + ", Dress Cost :" + this.dressCost;
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            System.out.println("ref is not null");
            if (object instanceof Malleshwaram) {
                System.out.println("ref is Malleshwaram, will compare...");
                Malleshwaram m = (Malleshwaram) object;
                return this.shop.equals(m.shop) &&
                        this.purchace.equals(m.purchace) &&
                        this.dressCost == m.dressCost;
            }
        }
        return false;
    }
}
