package net.wintooo.tffaf.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.wintooo.tffaf.content.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DEEPSLATE_MANASTONE_ORE)
                .add(ModBlocks.MANASTONE_ORE)
                .add(ModBlocks.MANASTONE_BLOCK);
        getOrCreateTagBuilder(BlockTags.STONE_ORE_REPLACEABLES)
                .add(ModBlocks.MANASTONE_ORE);
        getOrCreateTagBuilder(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                .add(ModBlocks.DEEPSLATE_MANASTONE_ORE);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_MANASTONE_ORE)
                .add(ModBlocks.MANASTONE_ORE);
    }
}
