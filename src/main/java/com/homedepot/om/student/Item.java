package com.homedepot.om.student;

import java.util.Scanner;
import java.util.HashMap;

public class Item {
    // INSTANCE VARIABLES
    private int itemID;
    private String itemName;
    private String itemDescription;
    private String itemCategory;
    String[] roomArray = {"Front Yard", "Foyer", "Office", "Living Room", "Kitchen", "Dining", "Nursery", "Guest Suite", "Master Suite", "Back Yard"};
    private String itemRoom;

    HashMap<Integer, Item> itemMap = new HashMap<>();

    // CONSTRUCTORS
    public Item() {

    }

    public Item(int itemID, String itemName, String itemDescription, String itemCategory, String itemRoom) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemRoom = itemRoom;
    }

    // GETTERS & SETTERS
    public int getItemID() {
        return this.itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return this.itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getRoomItem() {
        return this.itemRoom;
    }

    public void setItemRoom(String itemRoom) {
        this.itemRoom = itemRoom;
    }

    // METHODS
    public void createItem() {
        Scanner userInputCreate = new Scanner(System.in);
        Item item = new Item();
        
        itemID++;
        System.out.println("Enter the item's name:");
        itemName = userInputCreate.nextLine();
        System.out.println("Enter the item's description:");
        itemDescription = userInputCreate.nextLine();
        System.out.println("Enter the item's category:");
        itemCategory = userInputCreate.nextLine();
        System.out.println("Which room does this item belong in?\n0 - Front Yard\n1 -Foyer\n2 - Office\n3 - Living Room\n4 - Kitchen\n5 - Dining Area\n6 - Nursery\n7- Guest Suite\n8 - Master Suite\n9 - Back Yard");
        itemRoom = roomArray[userInputCreate.nextInt()];
        System.out.println("Item ID: " + itemID);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Description: " + itemDescription);
        System.out.println("Item Category: " + itemCategory);
        System.out.println("Item Room: " + itemRoom);
        System.out.println("Is all of this correct? Y / N");
        if(userInputCreate.toString().toUpperCase().equals("Y")) {
            setItemID(itemID);
            setItemName(itemName);
            setItemDescription(itemDescription);
            setItemCategory(itemCategory);
            setItemRoom(itemRoom);
            itemMap.put(itemID, item);
            System.out.println(itemMap);
        } else if(userInputCreate.toString().toUpperCase().equals("N")) {
            System.out.println("Please enter the item's information again.");
        }
    }

    public void readItem() {

    }

    public void updateItem() {

    }

    public void deleteItem() {

    }

    public void readAllItems() {

    }
}