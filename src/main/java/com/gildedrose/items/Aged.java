package com.gildedrose.items;

import com.gildedrose.Item;

public class Aged extends Item {
    public Aged(int sell_in, int quality) {
        super("Aged Brie", sell_in, quality);
    }

    @Override
    protected void updateItemQuality() {
        increaseQuality();
    }

    @Override
    protected void updateQualityAfterSellIn() {
        increaseQuality();
    }

}

