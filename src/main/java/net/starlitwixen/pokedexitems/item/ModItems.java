package net.starlitwixen.pokedexitems.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.starlitwixen.pokedexitems.PokedexItems;
import net.starlitwixen.pokedexitems.item.custom.EvolutionStoneItem;

public class ModItems {

    public static final Item RARE_CANDY = registerItem("rare_candy", new Item(new FabricItemSettings()));
    public static final Item EVIOLITE = registerItem("eviolite", new Item(new FabricItemSettings()));
    public static final Item WATER_STONE = registerItem("water_stone", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item THUNDER_STONE = registerItem("thunder_stone", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item FIRE_STONE = registerItem("fire_stone", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item SUN_STONE = registerItem("sun_stone", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item MOON_STONE = registerItem("moon_stone", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item LEAF_STONE = registerItem("leaf_stone", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item ICE_STONE = registerItem("ice_stone", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item DAWN_STONE = registerItem("dawn_stone", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item DUSK_STONE = registerItem("dusk_stone", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item SHINY_STONE = registerItem("shiny_stone", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item BLACK_AUGURITE = registerItem("black_augurite", new Item(new FabricItemSettings()));
    public static final Item DRAGON_SCALE = registerItem("dragon_scale", new Item(new FabricItemSettings()));
    public static final Item KINGS_ROCK = registerItem("kings_rock", new Item(new FabricItemSettings()));
    public static final Item LINKING_CORD = registerItem("linking_cord", new Item(new FabricItemSettings()));
    public static final Item METAL_COAT = registerItem("metal_coat", new Item(new FabricItemSettings()));
    public static final Item OVAL_STONE = registerItem("oval_stone", new Item(new FabricItemSettings()));
    public static final Item PROTECTOR = registerItem("protector", new Item(new FabricItemSettings()));
    public static final Item UPGRADE = registerItem("upgrade", new Item(new FabricItemSettings()));
    public static final Item DUBIOUS_DISC = registerItem("dubious_disc", new Item(new FabricItemSettings()));
    public static final Item ELECTIRIZER = registerItem("electirizer", new Item(new FabricItemSettings()));
    public static final Item MAGMARIZER = registerItem("magmarizer", new Item(new FabricItemSettings()));
    public static final Item UNPROCESSED_MEGANITE = registerItem("unprocessed_meganite", new Item(new FabricItemSettings()));
    public static final Item ABOMASITE = registerItem("abomasite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item ABSOLITE = registerItem("absolite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item AERODACTYLITE = registerItem("aerodactylite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item AGGRONITE = registerItem("aggronite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item ALAKAZITE = registerItem("alakazite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item ALTARIANITE = registerItem("altarianite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item AMPHAROSITE = registerItem("ampharosite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item AUDINITE = registerItem("audinite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item BANETTITE = registerItem("banettite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item BEEDRILLITE = registerItem("beedrillite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item BLASTOISINITE = registerItem("blastoisinite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item BLAZIKENITE = registerItem("blazikenite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item CAMPERUPTITE = registerItem("cameruptite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item CHARIZARDITE_X = registerItem("charizardite_x", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item CHARIZARDITE_Y = registerItem("charizardite_y", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item DIANCITE = registerItem("diancite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item GALLADITE = registerItem("galladite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item GARCHOMPITE = registerItem("garchompite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item GARDEVOIRITE = registerItem("gardevoirite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item GENGARITE = registerItem("gengarite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item GLALITITE = registerItem("glalitite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item GYARADOSITE = registerItem("gyaradosite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item HERACRONITE = registerItem("heracronite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item HOUNDOOMINITE = registerItem("houndoominite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item KANGASKHANITE = registerItem("kangaskhanite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item LATIASITE = registerItem("latiasite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item LATIOSITE = registerItem("latiosite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item LOPUNNITE = registerItem("lopunnite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item LUCARIONITE = registerItem("lucarionite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item MANECTITE = registerItem("manectite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item MAWILITE = registerItem("mawilite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item MEDICHAMITE = registerItem("medichamite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item METAGROSSITE = registerItem("metagrossite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item MEWTWONITE_X = registerItem("mewtwonite_x", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item MEWTWONITE_Y = registerItem("mewtwonite_y", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item PIDGEOTITE = registerItem("pidgeotite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item PINSIRITE = registerItem("pinsirite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item SABLENITE = registerItem("sablenite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item SALAMENCITE = registerItem("salamencite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item SCEPTILITE = registerItem("sceptilite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item SCIZORITE = registerItem("scizorite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item SHARPEDONITE = registerItem("sharpedonite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item SLOWBRONITE = registerItem("slowbronite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item STEELIXITE = registerItem("steelixite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item SWAMPERTITE = registerItem("swampertite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item TYRANITARITE = registerItem("tyranitarite", new EvolutionStoneItem(new FabricItemSettings()));
    public static final Item VENUSAURITE = registerItem("venusaurite", new EvolutionStoneItem(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PokedexItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PokedexItems.LOGGER.info("Registering Mod Items for " + PokedexItems.MOD_ID);
    }

}
