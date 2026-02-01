package net.wintooo.tffaf.content.item.custom.trinkets;


import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;
import java.util.Objects;

public class EyePatch extends TrinketItem {
  @Override
  public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
    super.appendTooltip(stack, world, tooltip, context);
    tooltip.add(Text.translatable("text.eye_patch"));
  }
  public EyePatch(Settings settings) {
    super(settings);
  }

  @Override
  public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
    if(entity.hasVehicle()
            && Objects.requireNonNull(entity.getVehicle()).getType() == EntityType.BOAT
    )
    {
      entity.getVehicle().setVelocity(entity.getVehicle().getVelocity().multiply(1.05,0.7,1.05));
    }
  }
}