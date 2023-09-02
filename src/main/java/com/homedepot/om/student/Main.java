package com.homedepot.om.student;

// IMPORTS
import java.util.Scanner;
import java.lang.*;

// CREATE, READ, UPDATE, DELETE
// How do you eat an elephant? One bite at a time
// Brian Parsons
// Home Depot Software Engineering Apprentice
// 200507786

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        do {
            
            System.out.println("Welcome to the Parsons Attic Categorizor!");
            System.out.println("What would you like to do?");
            System.out.println("1 - Add an item to the atic?");
            System.out.println("2 - Edit an item already in the attic?");
            System.out.println("3 - Remove an item from the attic?");
            System.out.println("4 - Read a list of all items currently in the attic?");
            System.out.println("5 - Read information about one single item?");
            System.out.println("Type 'exit' at anytime to close the application.");
            
            Item item = new Item();
            switch (userInput.nextLine()) {
                case "1":
                    item.createItem();
                    break;
                case "2":
                    item.updateItem();
                    break;
                case "3":
                    item.deleteItem();
                    break;
                case "4":
                    item.readAllItems();
                    break;
                case "5":
                    item.readItem();
                    break;
                case "exit":
                    System.out.println("Thank you for using the PAC system\nClosing...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.out.println("Please try again...");
                    break;
            }
        } while (!userInput.nextLine().equalsIgnoreCase("EXIT"));
        System.out.println("Thank you for using the PAC System\nClosing...");
    }
}
