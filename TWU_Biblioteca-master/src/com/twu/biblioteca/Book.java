package com.twu.biblioteca;


public class Book {
    private  String name;
    private  String authorName;
    private  String publishYear;

    public Book(String name, String authorName, String publishYear){
        this.name = name;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    public String getBookDetails() {
        return name+"\t"+authorName+"\t"+publishYear;
    }
}
