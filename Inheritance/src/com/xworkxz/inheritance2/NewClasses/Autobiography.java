package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Novel;
import com.xworkxz.inheritance2.superclass.Book;

public class Autobiography {
    public void range(Book book) {
    book.lend();
    book.close();
    book.read();
    book.shelve();
    book.bookmark();

    if(book instanceof Novel)
    {
        Novel novel=(Novel) book;
        novel.country();

    }
    }
}
