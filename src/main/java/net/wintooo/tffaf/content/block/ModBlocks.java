package net.wintooo.tffaf.content.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.wintooo.tffaf.TrinketsForFriendsAndFamily;
import net.wintooo.tffaf.content.item.ModItems;

@SuppressWarnings("unused")
public class ModBlocks {
    public static final Block MANASTONE_ORE = registerWithItem("manastone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).luminance(6).requiresTool(), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_MANASTONE_ORE = registerWithItem("deepslate_manastone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).luminance(6).requiresTool(), UniformIntProvider.create(2, 5)));
    public static final Block MANASTONE_BLOCK = registerWithItem("manastone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_BLUE).luminance(8).requiresTool()));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, TrinketsForFriendsAndFamily.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ModItems.register(name, new BlockItem(registered, settings));
        return registered;
    }
    public static <T extends Block> T registerWithCustomItemSettings(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ModItems.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {
    }
}
