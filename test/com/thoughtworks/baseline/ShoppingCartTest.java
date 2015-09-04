package com.thoughtworks.baseline;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {
    @Test
    public void shouldReturnValueForCalculateTotal() {
        ArrayList<String> items = new ArrayList<>();
        items.add("1 book at 12.49");
        items.add("1 music CD at 14.99");
        items.add("1 chocolate bar at 0.85");
        InputParser inputParser = new InputParser(items);
        ShoppingCart testShoppingCart = new ShoppingCart(inputParser.parseInputList());
        assertEquals(0, testShoppingCart.calculateTotal(), 0.001);
    }
}
