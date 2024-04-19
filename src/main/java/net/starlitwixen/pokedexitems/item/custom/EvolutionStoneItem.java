package net.starlitwixen.pokedexitems.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EvolutionStoneItem extends Item {
    public EvolutionStoneItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
