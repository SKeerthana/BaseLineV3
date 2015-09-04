package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InputParserTest {
    @Test
    public void shouldParseOneInputStringToReturnOneItemObject() {
        ArrayList<String> items = new ArrayList<>();
        items.add("1 book at 12.49");
        InputParser inputParser = new InputParser(items);
        assertEquals(items.size(), inputParser.parseInputList().size());
    }

    @Test
    public void shouldParseInputString() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("book", 1, 10, false));
        ArrayList<String> itemString = new ArrayList<>();
        itemString.add("1 book at 12.49");
        InputParser inputParser = new InputParser(itemString);
        assertEquals(items,inputParser.parseInputList());
    }
}
