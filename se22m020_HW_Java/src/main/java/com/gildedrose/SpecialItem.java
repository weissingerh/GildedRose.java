package com.gildedrose;

public abstract class SpecialItem extends Item implements SpecialItemBehaviour{

    public SpecialItem(String name, int sellIn, int quality){
        super(name, sellIn, quality);
    }
}
