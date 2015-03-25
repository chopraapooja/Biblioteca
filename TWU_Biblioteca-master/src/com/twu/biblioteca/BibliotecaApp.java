package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp{

    private Library library;
    private Menu menu;
    private Map<String, Command> commandMap;

    BibliotecaApp() {
        this.library = new Library();
        initMenu();
        initCommandMap();
    }

    private void initCommandMap() {
        commandMap = new HashMap<String, Command>();
        commandMap.put("1", getListBookCommand());
        commandMap.put("2", geQuitCommand());
        commandMap.put("3",getCheckOutCommand());
    }

    private Command geQuitCommand() {
        return new Command() {
                @Override
                public String execute() {
                    System.out.println("Exiting App.............");
                    System.exit(0);
                    return null;
                }
            };
    }

    private Command getCheckOutCommand(){
        return new Command() {
            @Override
            public String execute() {
                handleCheckout();
                return "";
            }
        };
    }

    private void handleCheckout() {
        System.out.println("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter book name:");
        String bookName= sc.nextLine();
        boolean cheCkOutStatus =  library.addNewEntry(name,bookName);
        if(cheCkOutStatus)
            System.out.println("Enjoy \""+ bookName +"\"!!");
        else
            System.out.println("Book not found in the available books");
    }

    private Command getListBookCommand() {
        return new Command() {
            @Override
            public String execute() {
                return library.getBookList();
            }
        };
    }

    private void initMenu() {
        menu = new Menu();
        menu.addItem(new MenuItem("List Books"));
        menu.addItem(new MenuItem("Quit"));
        menu.addItem(new MenuItem("Checkout Book"));
    }

    public String getMenuList() {
        return menu.getMenuList();
    }

    public String handle(String option) {
        return commandMap.get(option).execute();
    }

}
