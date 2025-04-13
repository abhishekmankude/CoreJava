package com.xworkz.ToString.internal;

public class Candle {
    private String scent;

    public Candle(String scent) {
        this.scent = scent;

    }

    @Override
    public String toString() {
        return "Candle scent: " + this.scent + ", weight: " ;
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
            if(object instanceof Candle) {
                System.out.println("ref is Candle, will compare...");
                Candle candle = this;
                Candle candle1 = (Candle) object;
                if(candle.scent.equals(candle1.scent) )
                      {
                    return true;
                }
            }
        }
        return false;
    }
}