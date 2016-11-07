package com.rdsguild.mods;

import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

// pool2.addEntry(new LootEntryItem(ITEM, WEIGHT, QUALITY, FUNCTIONS, CONDITIONS, NAME));

public class VTLootTables {

	@SubscribeEvent
	public void onLootTablesLoaded(LootTableLoadEvent event) {
		/*if (event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON)) {
			final LootPool pool2 = event.getTable().getPool("pool2");
			if (pool2 != null) {
				pool2.addEntry(new LootEntryItem(Items.COOKIE, 10, 0, new LootFunction[0], new LootCondition[0], "lootable:cookie"));
			}
		}
		
		if (event.getName().equals(LootTableList.ENTITIES_SHEEP_BLACK)) {
			final LootPool main = event.getTable().getPool("main");
			if (main != null) {
				 main.addEntry(new LootEntryItem(Items.BEEF, 10, 0, new LootFunction[0], new LootCondition[0], "lootable:sheep"));
			}
		}*/		
	}	
}


