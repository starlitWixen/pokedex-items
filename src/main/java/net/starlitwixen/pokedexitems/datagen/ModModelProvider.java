package net.starlitwixen.pokedexitems.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.starlitwixen.pokedexitems.block.ModBlocks;
import net.starlitwixen.pokedexitems.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EVIOLITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_EVIOLITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MEGANITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_MEGANITE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RARE_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.EVIOLITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDER_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUN_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOON_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAF_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DAWN_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUSK_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHINY_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_AUGURITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGON_SCALE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGS_ROCK, Models.GENERATED);
        itemModelGenerator.register(ModItems.LINKING_CORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_COAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OVAL_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PROTECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.UPGRADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUBIOUS_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELECTIRIZER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGMARIZER, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNPROCESSED_MEGANITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ABOMASITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ABSOLITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AERODACTYLITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AGGRONITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALAKAZITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALTARIANITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMPHAROSITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AUDINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANETTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEDRILLITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLASTOISINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZIKENITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAMPERUPTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARIZARDITE_X, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARIZARDITE_Y, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIANCITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GALLADITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARCHOMPITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARDEVOIRITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GENGARITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLALITITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GYARADOSITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HERACRONITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOUNDOOMINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KANGASKHANITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LATIASITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LATIOSITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LOPUNNITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUCARIONITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANECTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAWILITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEDICHAMITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAGROSSITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEWTWONITE_X, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEWTWONITE_Y, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIDGEOTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINSIRITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABLENITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALAMENCITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCEPTILITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCIZORITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHARPEDONITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLOWBRONITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEELIXITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWAMPERTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TYRANITARITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VENUSAURITE, Models.GENERATED);

    }
}
