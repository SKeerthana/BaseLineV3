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
    public void shouldReturnValidItemList() {
        ArrayList<String> items = new ArrayList<>();
        items.add("1 book at 12.49");
        ArrayList<Item> itemList = new ArrayList<Item>() {{
            add(new Item("book", 1, 12.49, false));
        }};
        InputParser inputParser = new InputParser(items);
        assertEquals(itemList, inputParser.parseInputList());
    }
}
