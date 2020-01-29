package com.gildedrose.items;

import com.gildedrose.Item;

public class Backstage extends Item {
    public Backstage(int sell_in, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sell_in, quality);
    }

    @Override
    protected void updateItemQuality() {
        if (quality >= 50) {
            return;
        }
        quality = quality + 1;

        if (sellIn < 11) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }

        if (sellIn < 6) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }
}
