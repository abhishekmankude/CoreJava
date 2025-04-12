package com.xworkz.ToString.internal;

public class Book {
    private String company;
    private int noOfPages;
    private int cost;

    public Book(String company, int noOfPages, int cost) {
        this.company = company;
        this.noOfPages = noOfPages;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book company: " + this.company + ", cost: " + this.cost + ", pages: " + this.noOfPages;
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
            if(object instanceof Book) {
                System.out.println("ref is Book, will compare...");
                Book book = this;
                Book book1 = (Book) object;
                if(book.company.equals(book1.company) && book.noOfPages == book1.noOfPages && book.cost == book1.cost) {
                    return true;
                }
            }
        }
        return false;
    }
}