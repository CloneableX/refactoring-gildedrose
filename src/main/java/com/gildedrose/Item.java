package com.gildedrose;

public class Item {

    protected String name;

    protected int sellIn;

    protected int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sellIn = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    protected void updateItemQuality() {
        decreaseQuality();
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void updateQualityAfterSellIn() {
        decreaseQuality();
    }

    protected void decreaseQuality() {
        if (quality <= 0) {
            return;
        }
        quality = quality - 1;
    }

    public void updateQuality() {
        updateItemQuality();

        updateSellIn();

        if (sellIn < 0) {
            updateQualityAfterSellIn();
        }
    }

    protected void increaseQuality() {
        if (quality >= 50) {
            return;
        }
        quality = quality + 1;
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public String getName() {
        return name;
    }
}
