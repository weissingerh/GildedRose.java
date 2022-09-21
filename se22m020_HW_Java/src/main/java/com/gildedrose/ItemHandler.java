package com.gildedrose;

class ItemHandler {

    Item item;

    public ItemHandler(Item item) {
        this.item = item;
    }

    public void increaseQualityBy(int by){
        if(isMaxQuality()){
            return;
        }
        this.item.quality =+ by;

        if(isAboveMaxQuality()){
            this.item.quality = GildedRose.maxQuality;
        }
    }
    public void decreaseQualityBy(int by){
        if(isMinQuality()){
            return;
        }

        this.item.quality = this.item.quality - by;

        if(this.item.quality < GildedRose.minQuality){
            this.item.quality = GildedRose.minQuality;
        }
    }
    public void decreaseSellInBy(int by){
        this.item.sellIn = this.item.sellIn - by;
    }
    public boolean isAboveMaxQuality(){
        return this.item.quality > GildedRose.maxQuality;
    }
    public boolean isMaxQuality(){
        return this.item.quality == GildedRose.maxQuality;
    }
    public boolean isMinQuality(){
        return this.item.quality == GildedRose.minQuality;
    }

    public SpecialItem categorizeSpecialItem(){
        if(this.item.name == "Sulfuras, Hand of Ragnaros"){
            return new Sulfaras(this.item.name, this.item.sellIn, this.item.quality);
        } else if(this.item.name == "Aged Brie"){
            return new Brie(this.item.name, this.item.sellIn, this.item.quality);
        } else {
           return new Backstage(this.item.name, this.item.sellIn, this.item.quality);
        }
    }

    public boolean isSpecialItem(){
        return this.item.name == "Sulfuras, Hand of Ragnaros"
            || this.item.name == "Aged Brie"
            || this.item.name == "Backstage passes to a TAFKAL80ETC concert";
    }
}
