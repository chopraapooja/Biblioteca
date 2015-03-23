package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp{

    private String welcomeMsg;
    private Library library;
    private Scanner sc = new Scanner(System.in);
    private static final String BANNER = "\n_________________________________________________________";

    BibliotecaApp() {
        this.library = new Library();
        this.welcomeMsg = "***Welcome to Biblioteca***";
    }

    private void addDemoBooks() {
        library.addBook(new Book("The adventures of S.Homes", "Sir AC", "2008"));
        library.addBook(new Book("Wings of fire","A.P.J Kalam","2005"));
        library.addBook(new Book("Wings of fire","A.P.J Kalam","2001"));
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.run();
    }

    private void run() {
        System.out.println(getWelcomeMsg());
        addDemoBooks();
        while (true) {
            showMenu();
            int option = sc.nextInt();
            switch (option) {
                case 1 :
                    listBooks();
                    break;
                case 2:
                    quitApp();
                    break;
                default:
                    showInvalidOption();
            }
        }

    }

    private void showInvalidOption() {
        System.out.println(surroundBanner(new StringBuilder("Invalid Option ! !")));
    }

    private void quitApp() {
        System.out.println(surroundBanner(new StringBuilder("Thanks for using our Biblioteca")));
        System.exit(0);
    }

    private void listBooks() {
        Walker walker = new Walker() {
            StringBuilder booksDetails = new StringBuilder();
            @Override
            public void collectBookDetails(String book) {
                booksDetails.append(System.lineSeparator());
                booksDetails.append(book);
            }
            public StringBuilder getBooksDetails() {
                return booksDetails;
            }
        };
        library.listBooks(walker);
        String booksDetails;
        booksDetails = surroundBanner(walker.getBooksDetails());
        System.out.println(booksDetails);
    }

    private String surroundBanner(StringBuilder content) {
        return BANNER+content+BANNER;
    }

    private void showMenu() {
        System.out.println("Available options :-");
        System.out.println("1. List of Books");
        System.out.println("2. Quit");
        System.out.println("Select an option :");

    }

    private String getWelcomeMsg() {
        return welcomeMsg;
    }
}
