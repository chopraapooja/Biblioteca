package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MenuTest {
    @Test
    public void testGetMenuList() {
        Menu chotaMenu = new Menu();
        chotaMenu.addItem(new MenuItem("Chota Bheem"));
        chotaMenu.addItem(new MenuItem("Chota Golu"));
        String chotaMenuList = chotaMenu.getMenuList();
        String expectedMenuList = "1.Chota Bheem" + System.lineSeparator() +"2.Chota Golu" + System.lineSeparator();
        assertEquals(expectedMenuList, chotaMenuList);
    }
}
