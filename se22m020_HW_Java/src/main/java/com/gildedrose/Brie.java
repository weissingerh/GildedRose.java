package com.gildedrose;

public class Brie extends SpecialItem {

    private ItemHandler itemHandler;
    public Brie(String name, int sellIn, int quality){
        super(name, sellIn, quality);
        ItemHandler itemHandler = new ItemHandler(this);
    }

    public void specialBehaviour(){
        this.itemHandler.increaseQualityBy(1);
        this.itemHandler.decreaseSellInBy(1);
    }

}
