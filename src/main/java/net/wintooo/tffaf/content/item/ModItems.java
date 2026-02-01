package net.wintooo.tffaf.content.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;
import net.wintooo.tffaf.TrinketsForFriendsAndFamily;
import net.wintooo.tffaf.content.block.ModBlocks;
import net.wintooo.tffaf.content.item.custom.normal.EternalSandwich;
import net.wintooo.tffaf.content.item.custom.normal.RidersCushion;
import net.wintooo.tffaf.content.item.custom.normal.VoidPouch;
import net.wintooo.tffaf.content.item.custom.trinkets.*;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ModItems {
    public static final Item MANASTONE_POWDER = register("manastone_powder", new Item(new FabricItemSettings()));

    //Trinkets
    public static final Item RABBITS_CHARM = register("rabbits_charm", new RabbitsCharm(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item RUNNING_SHOES = register("running_shoes", new RunningShoes(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item IRON_GAUNTLET = register("iron_gauntlet", new IronGauntlet(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item LUCKY_PICKAXE_HEAD = register("lucky_pickaxe_head", new LuckyPickaxeHead(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item FEATHER_CHARMS = register("feather_charms", new FeatherCharms(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item OLD_MINING_HELMET = register("old_mining_helmet", new OldMiningHelmet(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item COWBOY_SPURS = register("cowboy_spurs", new CowboySpurs(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item EYE_PATCH = register("eye_patch", new EyePatch(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item FIN_CAP = register("fin_cap", new FinCap(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item TETHERED_SOUL = register("tethered_soul", new TetheredSoul(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item BLAZING_CHARM = register("blazing_charm", new BlazingCharm(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item WITHER_RING = register("wither_ring", new WitherRing(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item ICICLE_AGLETS = register("icicle_aglets", new IcicleAglets(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item AMETHYST_CHARM = register("amethyst_charm", new AmethystCharm(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item VOID_POUCH = register("void_pouch", new VoidPouch(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item ETERNAL_SANDWICH = register("eternal_sandwich", new EternalSandwich(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item RIDERS_CUSHION = register("riders_cushion", new RidersCushion(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));

    public static final List<ItemConvertible> BLACKLIST = new ArrayList<>();
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, TrinketsForFriendsAndFamily.id(name), item);
    }
    private static void addItemsToIngredientTab(FabricItemGroupEntries entries) {
        entries.add(MANASTONE_POWDER);
    }
    private static void addItemsToToolsTab(FabricItemGroupEntries entries) {
        entries.add(RABBITS_CHARM);
        entries.add(RUNNING_SHOES);
        entries.add(IRON_GAUNTLET);
        entries.add(LUCKY_PICKAXE_HEAD);
        entries.add(FEATHER_CHARMS);
        entries.add(OLD_MINING_HELMET);
        entries.add(COWBOY_SPURS);
        entries.add(EYE_PATCH);
        entries.add(FIN_CAP);
        entries.add(TETHERED_SOUL);
        entries.add(BLAZING_CHARM);
        entries.add(WITHER_RING);
        entries.add(ICICLE_AGLETS);
        entries.add(AMETHYST_CHARM);
        entries.add(VOID_POUCH);
        entries.add(ETERNAL_SANDWICH);
        entries.add(RIDERS_CUSHION);
    }
    private static void addItemsToFoodTab(FabricItemGroupEntries entries) {
        entries.add(ETERNAL_SANDWICH);
    }
    private static void addItemsToBuildingBlocksTab(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.MANASTONE_BLOCK);
    }

    private static void addItemsToNaturalBlocksTab(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.MANASTONE_ORE);
        entries.add(ModBlocks.DEEPSLATE_MANASTONE_ORE);
    }
    public static void load() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalBlocksTab);
    }
}