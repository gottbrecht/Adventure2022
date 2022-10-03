package org.example;

import java.util.ArrayList;

public class Item {

    private String item;
    private String itemList;
    private String itemName;


    private String cash;
    private String goldenWheels;        //Items could be anything. I just chose some.
    private String carPolish;
    private String dogBites; //for the wolves

    public String getItem() {
        return item;
    }
    public String getItemList() {
        return itemList;
    }
    private Item (String item, String itemList, String itemName, String cash, String goldenWheels, String carPolish) {
        this.item = item;
        this.itemList = itemList;
        this.itemName = itemName;
        this.cash = cash;
        this.goldenWheels = goldenWheels;
        this.carPolish = carPolish;

    }

    private final ArrayList<Item> Item = new ArrayList<>();

    @Override
    public String toString() {
        return "org.example.Item{" +
                "item='" + item + "itemList=" + itemList + "itemName='" + itemName;

    }
}
