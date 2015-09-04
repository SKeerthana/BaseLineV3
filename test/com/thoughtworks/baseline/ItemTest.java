package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void shouldEqualsMethodReturnFlaseForDifferentObject() {
        Item item1 = new Item("book", 1, 10, false);
        assertNotEquals(item1, "string");
    }

    @Test
    public void shouldReturnTrueIfItemNameIsSame() {
        Item item1 = new Item("book", 1, 10, false);
        Item item2 = new Item("book", 12, 101, true);
        assertEquals(item1, item2);
    }
}
