package com.xworkz.ToString.internal;

public class NoteBook {
    private String brand;
    private int pages;
    private String size;

    public NoteBook(String brand, int pages, String size) {
        this.brand = brand;
        this.pages = pages;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Notebook brand " + this.brand + " pages " + this.pages + " size " + this.size;
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            System.out.println("ref is not null");
            if (object instanceof NoteBook) {
                System.out.println("ref is NoteBook, will compare...");
                NoteBook noteBook = (NoteBook) object;
                return this.brand.equals(noteBook.brand) &&
                        this.pages == noteBook.pages &&
                        this.size.equals(noteBook.size);
            }
        }
        return false;
    }
}
