package net.wintooo.tffaf.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.wintooo.tffaf.content.block.ModBlocks;
import net.wintooo.tffaf.content.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COWBOY_SPURS, 1)
                .pattern("  C")
                .pattern("LC ")
                .pattern("M  ")
                .input('C', Items.COPPER_INGOT)
                .input('L', Items.LEATHER)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COWBOY_SPURS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EYE_PATCH, 1)
                .pattern("  L")
                .pattern("LLB")
                .pattern("M  ")
                .input('B', Items.BLACK_DYE)
                .input('L', Items.LEATHER)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EYE_PATCH)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FEATHER_CHARMS, 1)
                .pattern("FMF")
                .input('F', Items.FEATHER)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FEATHER_CHARMS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_GAUNTLET, 1)
                .pattern("IMI")
                .pattern("III")
                .pattern("CCC")
                .input('I', Items.IRON_INGOT)
                .input('C', Items.CHAIN)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_GAUNTLET)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LUCKY_PICKAXE_HEAD, 1)
                .input(Items.GOLDEN_PICKAXE, 1)
                .input(Items.LEAD, 1)
                .input(ModItems.MANASTONE_POWDER, 1)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LUCKY_PICKAXE_HEAD)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OLD_MINING_HELMET, 1)
                .input(Items.TORCH, 1)
                .input(Items.IRON_HELMET, 1)
                .input(ModItems.MANASTONE_POWDER, 1)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OLD_MINING_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RABBITS_CHARM, 1)
                .pattern(" S ")
                .pattern("SMS")
                .pattern(" R ")
                .input('S', Items.STRING)
                .input('R', Items.RABBIT_FOOT)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RABBITS_CHARM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUNNING_SHOES, 1)
                .pattern("S S")
                .pattern("LML")
                .input('S', Items.STRING)
                .input('L', Items.LEATHER)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUNNING_SHOES)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FIN_CAP, 1)
                .input(Items.PRISMARINE_SHARD, 1)
                .input(Items.IRON_HELMET, 1)
                .input(ModItems.MANASTONE_POWDER, 1)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FIN_CAP)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TETHERED_SOUL, 1)
                .input(Items.GOLD_NUGGET, 1)
                .input(Items.COOKED_BEEF, 1)
                .input(ModItems.MANASTONE_POWDER, 1)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TETHERED_SOUL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHER_RING, 1)
                .pattern(" N ")
                .pattern("GMG")
                .pattern(" G ")
                .input('G', Items.GOLD_INGOT)
                .input('N', Items.NETHER_STAR)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WITHER_RING)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLAZING_CHARM, 1)
                .pattern(" S ")
                .pattern("SMS")
                .pattern(" F ")
                .input('S', Items.STRING)
                .input('F', Items.FIRE_CHARGE)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLAZING_CHARM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMETHYST_CHARM, 1)
                .pattern(" S ")
                .pattern("SMS")
                .pattern(" A ")
                .input('S', Items.STRING)
                .input('A', Items.AMETHYST_SHARD)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_CHARM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MOON_CHARM, 1)
                .pattern(" S ")
                .pattern("SMS")
                .pattern(" E ")
                .input('S', Items.STRING)
                .input('E', Items.END_STONE)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MOON_CHARM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUN_CHARM, 1)
                .pattern(" S ")
                .pattern("SMS")
                .pattern(" U ")
                .input('S', Items.STRING)
                .input('U', Items.SUNFLOWER)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SUN_CHARM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ICICLE_AGLETS, 1)
                .pattern(" P ")
                .pattern("PMP")
                .pattern(" S ")
                .input('P', Items.PACKED_ICE)
                .input('S', Items.STRING)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ICICLE_AGLETS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETERNAL_SANDWICH, 1)
                .input(Items.PORKCHOP, 1)
                .input(Items.SAND, 2)
                .input(ModItems.MANASTONE_POWDER, 1)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ETERNAL_SANDWICH)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VOID_POUCH, 1)
                .input(Items.ENDER_CHEST, 1)
                .input(ModItems.MANASTONE_POWDER, 1)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.VOID_POUCH)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RIDERS_CUSHION, 1)
                .pattern("RSR")
                .pattern(" M ")
                .input('S', Items.SADDLE)
                .input('R', Items.RED_WOOL)
                .input('M', ModItems.MANASTONE_POWDER)
                .criterion(hasItem(ModItems.MANASTONE_POWDER), conditionsFromItem(ModItems.MANASTONE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RIDERS_CUSHION)));
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MANASTONE_POWDER, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.MANASTONE_BLOCK);
    }
}
