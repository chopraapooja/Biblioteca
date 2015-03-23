package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by poojar on 3/23/2015.
 */
public class Library {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public void addBook(Book newBook) {
        bookList.add(newBook);
    }

    public boolean hasBook(Book book) {
        return bookList.contains(book);
    }

    public void listBooks(Walker walker) {
        for (Book book: bookList) {
            walker.collectBookDetails(book.getBookDetails());
        }
    }
}
