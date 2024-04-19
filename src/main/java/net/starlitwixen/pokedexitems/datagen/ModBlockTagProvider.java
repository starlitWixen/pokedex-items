package net.starlitwixen.pokedexitems.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.starlitwixen.pokedexitems.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.EVIOLITE_ORE)
                .add(ModBlocks.DEEPSLATE_EVIOLITE_ORE)
                .add(ModBlocks.MEGANITE_ORE)
                .add(ModBlocks.DEEPSLATE_MEGANITE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.EVIOLITE_ORE)
                .add(ModBlocks.DEEPSLATE_EVIOLITE_ORE)
                .add(ModBlocks.MEGANITE_ORE)
                .add(ModBlocks.DEEPSLATE_MEGANITE_ORE);
    }
}
