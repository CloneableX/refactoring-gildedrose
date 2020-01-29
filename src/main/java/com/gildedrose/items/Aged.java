package com.gildedrose.items;

import com.gildedrose.Item;

public class Aged extends Item {
    public Aged(int sell_in, int quality) {
        super("Aged Brie", sell_in, quality);
    }

    @Override
    protected void updateItemQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    protected void updateQualityAfterSellIn() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}

