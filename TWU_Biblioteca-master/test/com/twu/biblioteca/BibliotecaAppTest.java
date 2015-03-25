package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    private BibliotecaApp app;

    @Before
    public void setUp() throws Exception {
        app = new BibliotecaApp();
    }

    @Test
    public void testCheckoutBookShouldCheckoutForThePatron() {
        String patron = "Pc chopri";
        String bookName = "The God";
//        boolean isSuccessFullyCheckedOut = app.checkOutBook(patron, bookName);
//        boolean hasEnteredInRegister = app.checkRegister(patron, bookName);
//        boolean isBookCheckedOut = app.isBookCheckedOut(bookName);
//        assertTrue(isSuccessFullyCheckedOut);
//        assertTrue(hasEnteredInRegister);
//        assertTrue(isBookCheckedOut);
    }
    @Test
    public void testCheckoutWrongBook() {
//        boolean isSuccessFullyCheckedOut = app.checkOutBook("Narendra Modi", "Namo Namo");
//        assertFalse(isSuccessFullyCheckedOut);
    }

}