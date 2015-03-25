package com.twu.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        System.out.println("***Welcome to Biblioteca***");
        while(true) {
            System.out.println(app.getMenuList());
            String option = new Scanner(System.in).nextLine();
            String result = app.handle(option);
            System.out.println(result);
        }
    }
}
