package com.gildedrose;

public class Item {

    public static final String AGED = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sellIn = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    boolean isSulfuras() {
        return name.equals(SULFURAS);
    }

    boolean isBackstage() {
        return name.equals(BACKSTAGE);
    }

    boolean isAged() {
        return name.equals(AGED);
    }

    void updateItemQuality() {
        if (isAged() || isBackstage()) {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackstage()) {
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
            return;
        }
        if (quality <= 0) {
            return;
        }
        if (isSulfuras()) {
            return;
        }
        quality = quality - 1;
    }
}
