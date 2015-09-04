package com.thoughtworks.baseline;
//contains details about the input item
public class Item {
    private String itemName;
    private int quantity;
    private double price;
    private boolean isImported;

    public Item(String itemName, int quantity, double price, boolean isImported) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
        this.isImported = isImported;
    }

    public double calculateSalesTax() {
        return price;
    }

    @Override
    public boolean equals(Object that) {
        if(that.getClass() != getClass())
            return false;
        Item thatItem = (Item) that;
        if(thatItem.itemName.equals(itemName) && thatItem.quantity == (quantity) && thatItem.price == price)
            return true;
        return false;
    }
}
