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
import net.wintooo.tffaf.TrinketsForFriendsAndFamily;

import java.util.List;

public class RabbitsCharm extends TrinketItem {

    public RabbitsCharm(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("text.rabbits_charm"));
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.setStepHeight(1.25f);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.setStepHeight(0.6f);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(
                StatusEffects.JUMP_BOOST,
                40,
                TrinketsForFriendsAndFamily.CONFIG.effectLevels.rabbitsCharm() - 1,
                true,
                false
        ));
    }
}