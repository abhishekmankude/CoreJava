package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Novel;
import com.xworkxz.inheritance2.superclass.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();
        book.read();
        book.close();
        book.bookmark();
        book.lend();
        book.shelve();

        Book book1 = new Novel();
        book1.read();
        book1.close();
        book1.bookmark();
        book1.lend();
        book1.shelve();

        Novel novel = new Novel();
        novel.read();
        novel.close();
        novel.bookmark();
        novel.lend();
        novel.shelve();
    }
}