package net.starlitwixen.pokedexitems.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.starlitwixen.pokedexitems.PokedexItems;

public class ModBlocks {
    public static final Block EVIOLITE_ORE = registerBlock("eviolite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));

    public static final Block DEEPSLATE_EVIOLITE_ORE = registerBlock("deepslate_eviolite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)));

    public static final Block MEGANITE_ORE = registerBlock("meganite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));

    public static final Block DEEPSLATE_MEGANITE_ORE = registerBlock("deepslate_meganite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PokedexItems.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PokedexItems.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        PokedexItems.LOGGER.info("Registering ModBlocks for " + PokedexItems.MOD_ID);
    }
}
