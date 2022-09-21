package com.gildedrose;
class GildedRose {
    Item[] items;
    static int maxQuality = 50;
    static int minQuality = 0;

    public GildedRose(Item[] items) {
        this.items = items;
        this.minQuality = minQuality;
        this.maxQuality = maxQuality;
    }

    public void updateQuality() {
        for(Item item : items){
            ItemHandler itemHandler = new ItemHandler(item);
            if(itemHandler.isSpecialItem()){
                SpecialItem specialItem = itemHandler.categorizeSpecialItem();
                specialItem.specialBehaviour();
            } else {
                itemHandler.decreaseQualityBy(1);
                itemHandler.decreaseSellInBy(1);
            }
        }
    }
}
