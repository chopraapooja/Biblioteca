package com.twu.biblioteca;


public class Book {
    private  String name;
    private  String authorName;
    private  String publishYear;
    private boolean isCheckedOut;

    public Book(String name, String authorName, String publishYear){
        this.name = name;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    public String getBookDetails() {
        return name+"\t"+authorName+"\t"+publishYear;
    }

    public boolean isNameEquals(String bookName) {
        return this.name.equals(bookName);
    }

    public boolean getStatus() {
        return isCheckedOut;
    }

    public void setStatus(boolean status) {
        this.isCheckedOut = status;
    }
}
