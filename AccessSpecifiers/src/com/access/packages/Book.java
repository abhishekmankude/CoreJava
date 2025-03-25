package com.access.packages;



public class Book {
    public String title;
    private double price;
    int pages;

    public Book() {
        this.title = "Java Programming Essentials";
        this.price = 499.99;
        this.pages = 350;
    }

    public void displayTitle() {
        System.out.println("The book title is: " + title);
    }

    private void displayPrice() {
        System.out.println("Price of the book is: " + price);
    }

     void displayPages() {
        System.out.println("Number of pages: " + pages);
    }

    public void priceAndPageDisplay() {
        displayPrice();
        displayPages();
    }


}


