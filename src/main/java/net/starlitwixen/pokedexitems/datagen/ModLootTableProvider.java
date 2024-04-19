package net.starlitwixen.pokedexitems.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.starlitwixen.pokedexitems.block.ModBlocks;
import net.starlitwixen.pokedexitems.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.EVIOLITE_ORE, oreDrops(ModBlocks.EVIOLITE_ORE, ModItems.EVIOLITE));
        addDrop(ModBlocks.DEEPSLATE_EVIOLITE_ORE, oreDrops(ModBlocks.DEEPSLATE_EVIOLITE_ORE, ModItems.EVIOLITE));
        addDrop(ModBlocks.MEGANITE_ORE, oreDrops(ModBlocks.MEGANITE_ORE, ModItems.UNPROCESSED_MEGANITE));
        addDrop(ModBlocks.DEEPSLATE_MEGANITE_ORE, oreDrops(ModBlocks.DEEPSLATE_MEGANITE_ORE, ModItems.UNPROCESSED_MEGANITE));
    }
}
