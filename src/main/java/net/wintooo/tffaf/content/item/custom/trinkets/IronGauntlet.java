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

public class IronGauntlet extends TrinketItem {

    public IronGauntlet(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("text.iron_gauntlet"));
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(
                StatusEffects.STRENGTH,
                20,
                TrinketsForFriendsAndFamily.CONFIG.effectLevels.ironGauntlet() - 1,
                true,
                false
        ));
    }
}