package net.starlitwixen.pokedexitems.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.starlitwixen.pokedexitems.PokedexItems;
import net.starlitwixen.pokedexitems.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup POKEDEX_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PokedexItems.MOD_ID, "rare_candy"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pokedex_items_group"))
                    .icon(() -> new ItemStack(ModItems.RARE_CANDY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RARE_CANDY);
                        entries.add(ModItems.EVIOLITE);
                        entries.add(ModBlocks.EVIOLITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_EVIOLITE_ORE);
                        entries.add(ModItems.WATER_STONE);
                        entries.add(ModItems.THUNDER_STONE);
                        entries.add(ModItems.FIRE_STONE);
                        entries.add(ModItems.SUN_STONE);
                        entries.add(ModItems.MOON_STONE);
                        entries.add(ModItems.LEAF_STONE);
                        entries.add(ModItems.ICE_STONE);
                        entries.add(ModItems.DAWN_STONE);
                        entries.add(ModItems.DUSK_STONE);
                        entries.add(ModItems.SHINY_STONE);
                        entries.add(ModItems.BLACK_AUGURITE);
                        entries.add(ModItems.DRAGON_SCALE);
                        entries.add(ModItems.KINGS_ROCK);
                        entries.add(ModItems.LINKING_CORD);
                        entries.add(ModItems.METAL_COAT);
                        entries.add(ModItems.OVAL_STONE);
                        entries.add(ModItems.PROTECTOR);
                        entries.add(ModItems.UPGRADE);
                        entries.add(ModItems.DUBIOUS_DISC);
                        entries.add(ModItems.ELECTIRIZER);
                        entries.add(ModItems.MAGMARIZER);
                        entries.add(ModItems.UNPROCESSED_MEGANITE);
                        entries.add(ModItems.ABOMASITE);
                        entries.add(ModItems.ABSOLITE);
                        entries.add(ModItems.AERODACTYLITE);
                        entries.add(ModItems.AGGRONITE);
                        entries.add(ModItems.ALAKAZITE);
                        entries.add(ModItems.ALTARIANITE);
                        entries.add(ModItems.AMPHAROSITE);
                        entries.add(ModItems.AUDINITE);
                        entries.add(ModItems.BANETTITE);
                        entries.add(ModItems.BEEDRILLITE);
                        entries.add(ModItems.BLASTOISINITE);
                        entries.add(ModItems.BLAZIKENITE);
                        entries.add(ModItems.CAMPERUPTITE);
                        entries.add(ModItems.CHARIZARDITE_X);
                        entries.add(ModItems.CHARIZARDITE_Y);
                        entries.add(ModItems.DIANCITE);
                        entries.add(ModItems.GALLADITE);
                        entries.add(ModItems.GARCHOMPITE);
                        entries.add(ModItems.GARDEVOIRITE);
                        entries.add(ModItems.GENGARITE);
                        entries.add(ModItems.GLALITITE);
                        entries.add(ModItems.GYARADOSITE);
                        entries.add(ModItems.HERACRONITE);
                        entries.add(ModItems.HOUNDOOMINITE);
                        entries.add(ModItems.KANGASKHANITE);
                        entries.add(ModItems.LATIASITE);
                        entries.add(ModItems.LATIOSITE);
                        entries.add(ModItems.LOPUNNITE);
                        entries.add(ModItems.LUCARIONITE);
                        entries.add(ModItems.MANECTITE);
                        entries.add(ModItems.MAWILITE);
                        entries.add(ModItems.MEDICHAMITE);
                        entries.add(ModItems.METAGROSSITE);
                        entries.add(ModItems.MEWTWONITE_X);
                        entries.add(ModItems.MEWTWONITE_Y);
                        entries.add(ModItems.PIDGEOTITE);
                        entries.add(ModItems.PINSIRITE);
                        entries.add(ModItems.SABLENITE);
                        entries.add(ModItems.SALAMENCITE);
                        entries.add(ModItems.SCEPTILITE);
                        entries.add(ModItems.SCIZORITE);
                        entries.add(ModItems.SHARPEDONITE);
                        entries.add(ModItems.SLOWBRONITE);
                        entries.add(ModItems.STEELIXITE);
                        entries.add(ModItems.SWAMPERTITE);
                        entries.add(ModItems.TYRANITARITE);
                        entries.add(ModItems.VENUSAURITE);
                        entries.add(ModBlocks.MEGANITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MEGANITE_ORE);
                    }).build());

    public static void registerItemGroups() {
        PokedexItems.LOGGER.info("Registering Item Groups for " + PokedexItems.MOD_ID);
    }
}
