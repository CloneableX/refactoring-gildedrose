package com.gildedrose;

public class Item {

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

    protected void updateItemQuality() {
        decreaseQuality();
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void updateQualityAfterSellIn() {
        decreaseQuality();
    }

    private void decreaseQuality() {
        if (quality <= 0) {
            return;
        }
        quality = quality - 1;
    }

    void updateQuality() {
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
}
