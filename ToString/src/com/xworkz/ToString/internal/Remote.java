package com.xworkz.ToString.internal;

public class Remote {
    private String company;
    private String color;
    private int price;

    public Remote(String company, String color, int price) {
        this.company = company;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Remote company: " + company + ", color: " + color + ", price: " + price;
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
            if(object instanceof Remote) {
                System.out.println("ref is Remote, will compare...");
                Remote remote = this;
                Remote remote1 = (Remote) object;
                if(remote.company.equals(remote1.company) && remote.color.equals(remote1.color) && remote.price == remote1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}