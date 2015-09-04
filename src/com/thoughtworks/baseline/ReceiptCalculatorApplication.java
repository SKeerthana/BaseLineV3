package com.thoughtworks.baseline;

import java.util.ArrayList;

public class ReceiptCalculatorApplication {

    public static void main() {
        ArrayList<String> items = new ArrayList<>();
        items.add("1 book at 12.49");
        items.add("1 music CD at 14.99");
        items.add("1 chocolate bar at 0.85");

        InputParser inputParser = new InputParser(items);
        ShoppingCart shoppingCart = new ShoppingCart(inputParser.parseInputList());
        Double total = shoppingCart.calculateTotal();
        System.out.print(total);
        
    }
}
