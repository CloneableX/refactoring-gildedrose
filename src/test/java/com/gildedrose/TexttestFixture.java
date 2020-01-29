package com.gildedrose;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println(generateTestString());
    }

    public static String generateTestString() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outputStream);
        out.println("OMGHAI!");

        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item(Item.AGED, 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item(Item.SULFURAS, 0, 80), //
                new Item(Item.SULFURAS, -1, 80),
                new Item(Item.BACKSTAGE, 15, 20),
                new Item(Item.BACKSTAGE, 10, 49),
                new Item(Item.BACKSTAGE, 5, 49),
                new Item(Item.BACKSTAGE, 1, 20),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 3;

        for (int i = 0; i < days; i++) {
            out.println("-------- day " + i + " --------");
            out.println("name, sellIn, quality");
            for (Item item : items) {
                out.println(item);
            }
            out.println();
            app.updateQuality();
        }
        return outputStream.toString();
    }

}
