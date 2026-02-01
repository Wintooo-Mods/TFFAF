package net.wintooo.tffaf.content.item.custom.trinkets;


import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class OldMiningHelmet extends TrinketItem {

    public OldMiningHelmet(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("text.old_mining_helmet"));
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.hasVehicle()) {
            assert entity.getVehicle() != null;
            if (entity.getVehicle().getType() == EntityType.MINECART) {
                entity.getVehicle().addVelocity(0.05, 0, 0.05);
            }
        }

        if (entity.getY() < 35) {
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.NIGHT_VISION, 40, 0, true, false
            ));
        }
    }
}