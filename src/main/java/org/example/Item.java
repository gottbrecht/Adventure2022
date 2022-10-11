package org.example;

import java.util.ArrayList;

public class Item {

    public String item;
    public String itemName;
    public String itemDescription;

    public Item (String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public String getItem() {
        return item;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    @Override
    public String toString() {
        return itemName + ": " + itemDescription;

    }
}
