package com.xworkz.ToString.internal;

public class Console {
    private String name;
    private String manufacturer;
    private int price;

    public Console(String name, String manufacturer, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Console name: " + this.name + ", manufacturer: " + this.manufacturer + ", price: " + this.price;
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
            if(object instanceof Console) {
                System.out.println("ref is Console, will compare...");
                Console console = this;
                Console console1 = (Console) object;
                if(console.name.equals(console1.name) &&
                        console.manufacturer.equals(console1.manufacturer) &&
                        console.price == console1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}