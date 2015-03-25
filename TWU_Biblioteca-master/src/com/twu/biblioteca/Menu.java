package com.twu.biblioteca;

import java.util.*;
import java.util.List;

public class Menu {
    List<MenuItem> menuItemList;

    public Menu() {
        this.menuItemList = new ArrayList<MenuItem>();
    }

    public String getMenuList() {
        StringBuilder menuList = new StringBuilder();
        int index = 1;
        final String DOT = ".";
        final String NEWLINE = System.lineSeparator();
        for (MenuItem menuItem : menuItemList) {
            menuList.append(index++);
            menuList.append(DOT);
            menuList.append(menuItem.getName());
            menuList.append(NEWLINE);
        }
        return menuList.toString();
    }

    public void addItem(MenuItem menuItem) {
        menuItemList.add(menuItem);
    }
}