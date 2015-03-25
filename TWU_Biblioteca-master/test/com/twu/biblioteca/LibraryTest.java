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
    public void testSearchBook() {
        int indexOfBook1 = lib.searchBook("The God");
        int indexOfBook2 = lib.searchBook("Bakri In The Khet");
        assertEquals(0,indexOfBook1);
        assertEquals(2,indexOfBook2);
    }
    @Test
    public void testSearchBookShouldGiveNegativeIndexForWrongBookName() {
        int indexOfBook = lib.searchBook("The Goddess");
        assertEquals(-1,indexOfBook);
    }

    @Test
    public void testHasBookInLibrary() throws Exception {
        boolean status  = lib.hasBook("The God");
        assertTrue(status);
    }

    @Test
    public void testHasUnknownBook() throws Exception {
        boolean status  = lib.hasBook("The Godess");
        assertFalse(status);
    }

    @Test
    public void testaddNewEntry() {
        assertTrue(lib.addNewEntry("Parmatma", "The God"));
    }

    @Test
    public void testaddNewEntryWithUnkownBook() {
        assertFalse(lib.addNewEntry("Parmatma", "The Goddess"));
    }

//    @Test
//    public void addBook_should_add_newBook_in_the_library() {
//        Book newBook = new Book("Hello JAVA", "Pooja", "2015");
//        lib.addBook(newBook);
//        assertTrue(lib.hasBook(newBook));
//    }
//    @Test
//    public void hasBook_should_check_availability_of_book() {
//        Book newBook = new Book("Hello JAVA", "Pooja", "2015");
//        assertFalse(lib.hasBook(newBook));
//    }

}