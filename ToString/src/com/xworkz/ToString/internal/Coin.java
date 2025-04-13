package com.xworkz.ToString.internal;

public class Coin {
    private String coinName;


    public Coin(String coinName) {
        this.coinName = coinName;

    }

    @Override
    public String toString() {
        return "Coin name: " + this.coinName + ", material: " ;
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
                if(coin.coinName.equals(coin1.coinName) ) {
                    return true;
                }
            }
        }
        return false;
    }
}