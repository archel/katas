package com.gildedrose;

import com.gildedrose.domain.item.*;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                continue;
            }

            switch (item.name) {
                case "Aged Brie":
                    AgedBrieItem agedBrieItem = new AgedBrieItem(item.name, item.sellIn, item.quality);
                    agedBrieItem.updateSellInAndQuality();
                    items[i] = agedBrieItem;
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    BackstagePassesItem backstagePassesItem = new BackstagePassesItem(item.name, item.sellIn, item.quality);
                    backstagePassesItem.updateSellInAndQuality();
                    items[i] = backstagePassesItem;
                    break;
                case "Conjured Mana Cake":
                    ConjuredItem conjuredItem = new ConjuredItem(item.name, item.sellIn, item.quality);
                    conjuredItem.updateSellInAndQuality();
                    items[i] = conjuredItem;
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    LegendaryItem legendaryItem = new LegendaryItem(item.name, item.sellIn, item.quality);
                    legendaryItem.updateSellInAndQuality();
                    items[i] = legendaryItem;
                    break;
                default:
                    CommonItem commonItem = new CommonItem(item.name, item.sellIn, item.quality);
                    commonItem.updateSellInAndQuality();
                    items[i] = commonItem;
                    break;
            }
        }
    }
}