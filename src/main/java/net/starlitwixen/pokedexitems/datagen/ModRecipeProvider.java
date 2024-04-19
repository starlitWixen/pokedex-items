package net.starlitwixen.pokedexitems.datagen;

import com.sun.jna.platform.win32.BaseTSD;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.starlitwixen.pokedexitems.block.ModBlocks;
import net.starlitwixen.pokedexitems.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> EVIOLITE_SMELTABLES = List.of(ModBlocks.EVIOLITE_ORE, ModBlocks.DEEPSLATE_EVIOLITE_ORE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, EVIOLITE_SMELTABLES, RecipeCategory.MISC, ModItems.EVIOLITE,
                0.7f, 200, "eviolite");
        offerBlasting(exporter, EVIOLITE_SMELTABLES, RecipeCategory.MISC, ModItems.EVIOLITE,
                0.7f, 100, "eviolite");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LINKING_CORD, 1)
                .pattern("SSC")
                .pattern("SB ")
                .pattern("C S")
                .input('S', Items.STRING)
                .input('C', Items.COPPER_INGOT)
                .input('B', Items.SLIME_BALL)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.SLIME_BALL), conditionsFromItem(Items.SLIME_BALL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METAL_COAT)
                .input(Items.BUCKET)
                .input(Items.IRON_INGOT)
                .criterion(hasItem(Items.BUCKET), conditionsFromItem(Items.BUCKET))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.OVAL_STONE, Items.STONE_BUTTON, 1);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PROTECTOR, 1)
                .pattern(" B ")
                .pattern("B B")
                .pattern("B B")
                .input('B', Items.BRICK)
                .criterion(hasItem(Items.BRICK), conditionsFromItem(Items.BRICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.UPGRADE, 1)
                .pattern("GGG")
                .pattern("GDI")
                .pattern("GGG")
                .input('G', Items.GLASS)
                .input('D', ItemTags.MUSIC_DISCS)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.MUSIC_DISC_5), conditionsFromItem(Items.MUSIC_DISC_5))
                .criterion(hasItem(Items.MUSIC_DISC_11), conditionsFromItem(Items.MUSIC_DISC_11))
                .criterion(hasItem(Items.MUSIC_DISC_13), conditionsFromItem(Items.MUSIC_DISC_13))
                .criterion(hasItem(Items.MUSIC_DISC_CAT), conditionsFromItem(Items.MUSIC_DISC_CAT))
                .criterion(hasItem(Items.MUSIC_DISC_BLOCKS), conditionsFromItem(Items.MUSIC_DISC_BLOCKS))
                .criterion(hasItem(Items.MUSIC_DISC_CHIRP), conditionsFromItem(Items.MUSIC_DISC_CHIRP))
                .criterion(hasItem(Items.MUSIC_DISC_FAR), conditionsFromItem(Items.MUSIC_DISC_FAR))
                .criterion(hasItem(Items.MUSIC_DISC_MALL), conditionsFromItem(Items.MUSIC_DISC_MALL))
                .criterion(hasItem(Items.MUSIC_DISC_MELLOHI), conditionsFromItem(Items.MUSIC_DISC_MELLOHI))
                .criterion(hasItem(Items.MUSIC_DISC_OTHERSIDE), conditionsFromItem(Items.MUSIC_DISC_OTHERSIDE))
                .criterion(hasItem(Items.MUSIC_DISC_PIGSTEP), conditionsFromItem(Items.MUSIC_DISC_PIGSTEP))
                .criterion(hasItem(Items.MUSIC_DISC_RELIC), conditionsFromItem(Items.MUSIC_DISC_RELIC))
                .criterion(hasItem(Items.MUSIC_DISC_STAL), conditionsFromItem(Items.MUSIC_DISC_STAL))
                .criterion(hasItem(Items.MUSIC_DISC_STRAD), conditionsFromItem(Items.MUSIC_DISC_STRAD))
                .criterion(hasItem(Items.MUSIC_DISC_WAIT), conditionsFromItem(Items.MUSIC_DISC_WAIT))
                .criterion(hasItem(Items.MUSIC_DISC_WARD), conditionsFromItem(Items.MUSIC_DISC_WARD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DUBIOUS_DISC, 1)
                .pattern("TTT")
                .pattern("TDC")
                .pattern("TTT")
                .input('T', Items.TINTED_GLASS)
                .input('D', ModItems.UPGRADE)
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.UPGRADE), conditionsFromItem(ModItems.UPGRADE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ELECTIRIZER, 1)
                .pattern("CCC")
                .pattern("CFC")
                .pattern("CCC")
                .input('C', Items.COPPER_BLOCK)
                .input('F', Items.FURNACE)
                .criterion(hasItem(Items.FURNACE), conditionsFromItem(Items.FURNACE))
                .criterion(hasItem(Items.COPPER_BLOCK), conditionsFromItem(Items.COPPER_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGMARIZER, 1)
                .pattern("MMM")
                .pattern("MFM")
                .pattern("MMM")
                .input('M', Items.MAGMA_BLOCK)
                .input('F', Items.FURNACE)
                .criterion(hasItem(Items.FURNACE), conditionsFromItem(Items.FURNACE))
                .criterion(hasItem(Items.MAGMA_BLOCK), conditionsFromItem(Items.MAGMA_BLOCK))
                .offerTo(exporter);
    }
}
