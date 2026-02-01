package net.wintooo.tffaf.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.wintooo.tffaf.content.block.ModBlocks;
import net.wintooo.tffaf.content.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MANASTONE_ORE, manastoneOreDrops(ModBlocks.MANASTONE_ORE, ModItems.MANASTONE_POWDER));
        addDrop(ModBlocks.DEEPSLATE_MANASTONE_ORE, manastoneOreDrops(ModBlocks.DEEPSLATE_MANASTONE_ORE, ModItems.MANASTONE_POWDER));
        addDrop(ModBlocks.MANASTONE_BLOCK);
    }

    public LootTable.Builder manastoneOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop,
                ((LeafEntry.Builder<?>)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 2.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
