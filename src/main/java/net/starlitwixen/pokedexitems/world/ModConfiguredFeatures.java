package net.starlitwixen.pokedexitems.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.starlitwixen.pokedexitems.PokedexItems;
import net.starlitwixen.pokedexitems.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> EVIOLITE_ORE_KEY = registerKey("eviolite_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGANITE_ORE_KEY = registerKey("meganite_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> evioliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.EVIOLITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_EVIOLITE_ORE.getDefaultState()));

        register(context, EVIOLITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(evioliteOres, 3));

        List<OreFeatureConfig.Target> meganiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MEGANITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_MEGANITE_ORE.getDefaultState()));

        register(context, MEGANITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(meganiteOres, 3));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(PokedexItems.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
