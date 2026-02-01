package net.wintooo.tffaf.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.wintooo.tffaf.content.block.ModBlocks;
import net.wintooo.tffaf.content.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANASTONE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANASTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_MANASTONE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MANASTONE_POWDER, Models.GENERATED);

        itemModelGenerator.register(ModItems.RABBITS_CHARM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNNING_SHOES, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_GAUNTLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUCKY_PICKAXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FEATHER_CHARMS, Models.GENERATED);
        itemModelGenerator.register(ModItems.OLD_MINING_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COWBOY_SPURS, Models.GENERATED);
        itemModelGenerator.register(ModItems.EYE_PATCH, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIN_CAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.TETHERED_SOUL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZING_CHARM, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHER_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICICLE_AGLETS, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_CHARM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOON_CHARM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUN_CHARM, Models.GENERATED);

        itemModelGenerator.register(ModItems.VOID_POUCH, Models.GENERATED);
        itemModelGenerator.register(ModItems.ETERNAL_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.RIDERS_CUSHION, Models.GENERATED);
    }
}
