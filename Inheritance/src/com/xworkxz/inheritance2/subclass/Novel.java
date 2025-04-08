package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Book;

public class Novel extends Book {
    public Novel() { System.out.println("Novel constructor"); }

@Override
public void read() { System.out.println("Novel being read"); }
    public void close() { System.out.println("Novel being closed"); }
    public void bookmark() { System.out.println("Novel being bookmarked"); }
    public void lend() { System.out.println("Novel being lent"); }
    public void shelve() { System.out.println("Novel being shelved"); }
    public void country(){
        System.out.println("Country is Running");
    }
}