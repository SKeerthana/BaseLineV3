package com.thoughtworks.baseline;

import java.util.ArrayList;

public class RecieptCalculatorApplication {

    public static void main() {
        ArrayList<String> items = new ArrayList<>();
        items.add("1 book at 12.49");
        items.add("1 music CD at 14.99");
        items.add("1 chocolate bar at 0.85");
        ShoppingCart shoppingCart = new ShoppingCart(items);
        Double total = shoppingCart.calculateTotal();
    }
}
