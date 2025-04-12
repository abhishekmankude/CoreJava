package com.xworkz.ToString.internal;

public class Candle {
    private String scent;
    private int weight;
    private int price;

    public Candle(String scent, int weight, int price) {
        this.scent = scent;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candle scent: " + this.scent + ", weight: " + this.weight + "g, price: " + this.price;
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
                if(candle.scent.equals(candle1.scent) &&
                        candle.weight == candle1.weight &&
                        candle.price == candle1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}