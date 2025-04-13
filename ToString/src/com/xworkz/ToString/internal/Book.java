package com.xworkz.ToString.internal;

public class Book {
    private String company;


    public Book(String company) {
        this.company = company;

    }

    @Override
    public String toString() {
        return "Book company: " + this.company + ", cost: " ;
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
                if(book.company.equals(book1.company)) {
                    return true;
                }
            }
        }
        return false;
    }
}