package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private Map<String,Book> register = new HashMap<String, Book>();

    public boolean addNewEntry(String patronName, String bookName) {
        if(hasBook(bookName) && !checkRegister(patronName,bookName)){
            Book buk = bookList.get(searchBook(bookName));
            buk.setStatus(true);
            register.put(patronName, buk);
            return true;
        }
        return false;
    }

    public Library() {
        this.bookList = (ArrayList<Book>) initLibrary();
    }

    public boolean hasBook(String bookName) {
        for (Book book : bookList) {
            if(book.isNameEquals(bookName)) return true;
        }
        return false;
    }


    private List<Book> initLibrary() {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("The God", "Baba ji", "-2000"));
        bookList.add(new Book("Makad In The Zoo", "Dada Ji", "+2004"));
        bookList.add(new Book("Bakri In The Khet", "Nana Ji", "20001+"));
        return bookList;
    }

    public String getBookList() {
        StringBuilder books = new StringBuilder();
        for (Book book : bookList) {
            if(!book.getStatus()) {
                books.append(book.getBookDetails());
                books.append(System.lineSeparator());
            }
        }
        return books.toString();
    }

    public int searchBook(String bookName) {
        int counter = 0;
        for (Book book : bookList) {
            if(book.isNameEquals(bookName)) return counter;
            counter++;
        }
        return -1;
    }

    public boolean checkRegister(String patronName, String bookName) {
        if(register.containsKey(patronName) && register.get(patronName).isNameEquals(bookName)) {
            return true;
        }
        return false;
    }
}
