package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void shouldCalculateSalesTax() {
        Item item = new Item("book", 1, 10, false);
        assertEquals(10, item.calculateSalesTax(), 0);
    }

    @Test
    public void shouldEqualsMethodReturnTrueForItemObject() {
        Item item1 = new Item("book", 1, 10, false);
        Item item2 = new Item("book", 1, 10, false);
        assertEquals(item1, item2);
    }
}
