package net.wintooo.tffaf.content.item.custom.trinkets;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.minecraft.world.Heightmap;
import net.wintooo.tffaf.TrinketsForFriendsAndFamily;

import java.util.List;

public class SunCharm extends TrinketItem {

    public SunCharm(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("text.sun_charm"));
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.getWorld();
        long time = world.getTimeOfDay() % 24000;

        if (time >= 0 && time <= 12000) {
            int surfaceY = world.getTopY(Heightmap.Type.WORLD_SURFACE, (int) entity.getX(), (int) entity.getZ());
            if (entity.getY() >= surfaceY - 1) {
                entity.addStatusEffect(new StatusEffectInstance(
                        StatusEffects.SATURATION,
                        40,
                        TrinketsForFriendsAndFamily.CONFIG.effectLevels.sunCharm() - 1,
                        true,
                        false
                ));
            }
        }
    }
}