package net.wintooo.tffaf.content.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.wintooo.tffaf.TrinketsForFriendsAndFamily;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> MANASTONE_ORE_PLACED_KEY = registerKey("manastone_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup =
                context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(
                context,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MANASTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(
                        2,
                        HeightRangePlacementModifier.trapezoid(
                                YOffset.fixed(-64),
                                YOffset.fixed(0)
                        )
                )
        );
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TrinketsForFriendsAndFamily.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(ModPlacedFeatures.MANASTONE_ORE_PLACED_KEY, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}