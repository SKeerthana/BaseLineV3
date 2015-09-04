package com.thoughtworks.baseline;

import java.util.ArrayList;

//parses the input list and returns items list
public class InputParser {
    private ArrayList<String> inputItems;
    private ArrayList<String> validItems = new ArrayList<String>() {{
        add("book");
        add("music");
        add("chocolate");
        add("perfume");
        add("pills");
    }};

    public InputParser(ArrayList<String> inputItems) {
        this.inputItems = inputItems;
    }

    public ArrayList<Item> parseInputList() {
        ArrayList<Item> itemsList = new ArrayList<>();

        for (String itemString : inputItems) {

            int quantity = Integer.parseInt(itemString.substring(0, itemString.indexOf(" ")));
            String itemName = getItemName(itemString);
            Double price = Double.parseDouble(itemString.substring(itemString.lastIndexOf(" ")));
            boolean isImported = false;

            itemsList.add(new Item(itemName, quantity, price, isImported));
        }
        return itemsList;
    }

    private String getItemName(String itemString) {
        for (String item : validItems) {
            if (itemString.contains(item))
                return item;
        }
        return null;
    }
}
