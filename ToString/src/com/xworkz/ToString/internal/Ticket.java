package com.xworkz.ToString.internal;

public class Ticket {
    private String event;
    private String date;
    private int price;

    public Ticket(String event, String date, int price) {
        this.event = event;
        this.date = date;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket event: " + event + ", date: " + date + ", price: " + price;
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
            if(object instanceof Ticket) {
                System.out.println("ref is Ticket, will compare...");
                Ticket ticket = this;
                Ticket ticket1 = (Ticket) object;
                if(ticket.event.equals(ticket1.event) && ticket.date.equals(ticket1.date) && ticket.price == ticket1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}