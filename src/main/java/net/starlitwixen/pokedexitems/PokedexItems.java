package net.starlitwixen.pokedexitems;

import net.fabricmc.api.ModInitializer;

import net.starlitwixen.pokedexitems.block.ModBlocks;
import net.starlitwixen.pokedexitems.item.ModItemGroups;
import net.starlitwixen.pokedexitems.item.ModItems;
import net.starlitwixen.pokedexitems.util.ModLootTableModifiers;
import net.starlitwixen.pokedexitems.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokedexItems implements ModInitializer {
	public static final String MOD_ID = "pokedex_items";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModLootTableModifiers.modifyLootTables();
	}
}