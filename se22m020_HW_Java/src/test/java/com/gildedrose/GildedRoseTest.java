package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[]{new Item("fixme", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    void sulfarasStaysTheSame() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 5, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, app.items[0].quality);
        assertEquals(5, app.items[0].sellIn);
    }

    @Test
    void regularItemDecreasedBothSellInAndQuality(){
        Item[] items = new Item[]{new Item("Janz normal", 20, 7)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(6, app.items[0].quality);
        assertEquals(19, app.items[0].sellIn);
    }

    @Test
    void qualityZeroIsNotFurtherDecreased(){
        Item[] items = new Item[]{new Item("Zero", 10, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
}

