package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    Library lib;

    @Before
    public void setUp() throws Exception {
        lib = new Library();
    }

    @Test
    public void addBook_should_add_newBook_in_the_library() {
        Book newBook = new Book("Hello JAVA", "Pooja", "2015");
        lib.addBook(newBook);
        assertTrue(lib.hasBook(newBook));
    }
    @Test
    public void hasBook_should_check_availability_of_book() {
        Book newBook = new Book("Hello JAVA", "Pooja", "2015");
        assertFalse(lib.hasBook(newBook));
    }

}