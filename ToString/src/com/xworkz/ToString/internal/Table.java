package com.xworkz.ToString.internal;

public class Table {
    private String shape;
    private String material;
    private int price;

    public Table(String shape, String material, int price) {
        this.shape = shape;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Table shape: " + shape + ", material: " + material + ", price: " + price;
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
            if(object instanceof Table) {
                System.out.println("ref is Table, will compare...");
                Table table = this;
                Table table1 = (Table) object;
                if(table.shape.equals(table1.shape) && table.material.equals(table1.material) && table.price == table1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}