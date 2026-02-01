package net.wintooo.tffaf;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.wintooo.tffaf.content.block.ModBlocks;
import net.wintooo.tffaf.content.item.ModItems;
import net.wintooo.tffaf.content.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrinketsForFriendsAndFamily implements ModInitializer {
	public static final String MOD_ID = "tffaf";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final net.wintooo.tffaf.TFFAFConfig CONFIG = net.wintooo.tffaf.TFFAFConfig.createAndLoad();
    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }

	@Override
	public void onInitialize() {
        ModItems.load();
        ModBlocks.load();
        ModWorldGeneration.generateModWorldGen();
        LOGGER.info("TRINKETS.");
	}
}