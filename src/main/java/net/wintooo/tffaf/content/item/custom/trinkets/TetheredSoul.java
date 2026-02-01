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

public class TetheredSoul extends TrinketItem {
  @Override
  public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
    super.appendTooltip(stack, world, tooltip, context);
    tooltip.add(Text.translatable("text.tethered_soul"));
  }
  public TetheredSoul(Settings settings) {
    super(settings);
  }

  @Override
  public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
    if(!entity.hasStatusEffect(StatusEffects.ABSORPTION))
    {
      entity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,600, TrinketsForFriendsAndFamily.CONFIG.effectLevels.tetheredSoul() - 1,true,false));
    }
  }
}