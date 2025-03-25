package com.access.packages.runner;

import com.access.packages.Book;


public class RunnerForBook {
    public static void main(String[] args) {

        Book book = new Book();
        book.priceAndPageDisplay();
        book.displayTitle();
        //book.displayPages();
    }

}
