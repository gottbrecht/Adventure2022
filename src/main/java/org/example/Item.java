package org.example;

import java.util.ArrayList;

public class Item {

    private String name;
    private String description;

    private Item (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + ": " + description;

    }
}
