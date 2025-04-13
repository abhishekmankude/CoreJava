package com.xworkz.ToString.internal;

public class DiningTable {
    private String shape;


    public DiningTable(String shape) {
        this.shape = shape;

    }

    @Override
    public String toString() {
        return "DiningTable shape: " + this.shape + ", seats: " ;
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
                if(table.shape.equals(table1.shape) ) {
                    return true;
                }
            }
        }
        return false;
    }
}