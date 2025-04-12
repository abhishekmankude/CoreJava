package com.xworkz.ToString.internal;

public class Coin {
    private String coinName;
    private String material;
    private int year;

    public Coin(String coinName, String material, int year) {
        this.coinName = coinName;
        this.material = material;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coin name: " + this.coinName + ", material: " + this.material + ", year: " + this.year;
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
            if(object instanceof Coin) {
                System.out.println("ref is Coin, will compare...");
                Coin coin = this;
                Coin coin1 = (Coin) object;
                if(coin.coinName.equals(coin1.coinName) &&
                        coin.material.equals(coin1.material) &&
                        coin.year == coin1.year) {
                    return true;
                }
            }
        }
        return false;
    }
}