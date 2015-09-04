package com.thoughtworks.baseline;

import java.util.ArrayList;

//contains the list of input items
public class ShoppingCart {
    private ArrayList<String> items;

    public ShoppingCart(ArrayList<String> items) {
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0;
        for (String item : items) {
            total += extractTotalCostFromInputString(item);
        }
        return total;
    }

    private double extractTotalCostFromInputString(String item) {
        return Double.parseDouble(item.substring(item.lastIndexOf(" ") + 1));
    }
}
