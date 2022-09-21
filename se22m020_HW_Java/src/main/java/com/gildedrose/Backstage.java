package com.gildedrose;

public class Backstage extends SpecialItem {
    ItemHandler itemHandler;

    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.itemHandler = new ItemHandler(this);
    }

    public void specialBehaviour(){
        if (this.sellIn < 0) {
            this.quality = 0;
        }
        if (this.sellIn < 5) {
            this.itemHandler.increaseQualityBy(2);
        }
        if (this.sellIn < 11) {
            this.itemHandler.increaseQualityBy(1);
        }
        this.itemHandler.decreaseSellInBy(1);
    }
}
