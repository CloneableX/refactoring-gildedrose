package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured extends Item {
    public Conjured(int sellIn, int quality) {
        super("Conjured", sellIn, quality);
    }

    @Override
    protected void updateItemQuality() {
        decreaseQuality();
        decreaseQuality();
    }

    @Override
    protected void updateQualityAfterSellIn() {
        decreaseQuality();
        decreaseQuality();
    }
}
