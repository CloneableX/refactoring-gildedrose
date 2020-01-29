package com.gildedrose.items;

import com.gildedrose.Item;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConjuredSpec {
    @Test
    public void should_decrease_2_quality_when_before_sell_in() {
        int quality = 10;
        Item conjured = new Conjured(1, quality);
        conjured.updateQuality();

        assertThat(conjured.getQuality(), is(quality - 2));
    }

    @Test
    public void should_decrease_4_quality_when_after_sell_in() {
        int quality = 10;
        Item conjured = new Conjured(0, quality);
        conjured.updateQuality();
        assertThat(conjured.getQuality(), is(quality - 4));
    }
}
