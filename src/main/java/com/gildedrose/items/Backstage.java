package com.gildedrose.items;

import com.gildedrose.Item;

public class Backstage extends Item {
    public Backstage(int sell_in, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sell_in, quality);
    }

    @Override
    protected void updateItemQuality() {
        increaseQuality();

        if (sellIn < 11) {
            increaseQuality();
        }

        if (sellIn < 6) {
            increaseQuality();
        }
    }

    @Override
    protected void updateQualityAfterSellIn() {
        quality = 0;
    }
}
