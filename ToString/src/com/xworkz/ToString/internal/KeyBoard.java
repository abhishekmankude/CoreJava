package com.xworkz.ToString.internal;

public class KeyBoard {
    private String brand;
    private int noOfKeys;
    private int price;

    public KeyBoard(String brand, int noOfKeys, int price) {
        this.brand = brand;
        this.noOfKeys = noOfKeys;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard brand: " + this.brand + ", noOfKeys: " + this.noOfKeys + ", price: " + this.price;
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
            if(object instanceof KeyBoard) {
                System.out.println("ref is KeyBoard, will compare...");
                KeyBoard kb = this;
                KeyBoard kb1 = (KeyBoard) object;
                if(kb.brand.equals(kb1.brand) && kb.noOfKeys == kb1.noOfKeys && kb.price == kb1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}