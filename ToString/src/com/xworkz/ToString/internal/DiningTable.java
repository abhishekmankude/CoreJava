package com.xworkz.ToString.internal;

public class DiningTable {
    private String shape;
    private int seats;
    private int price;

    public DiningTable(String shape, int seats, int price) {
        this.shape = shape;
        this.seats = seats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DiningTable shape: " + this.shape + ", seats: " + this.seats + ", price: " + this.price;
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
            if(object instanceof DiningTable) {
                System.out.println("ref is DiningTable, will compare...");
                DiningTable table = this;
                DiningTable table1 = (DiningTable) object;
                if(table.shape.equals(table1.shape) &&
                        table.seats == table1.seats &&
                        table.price == table1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}