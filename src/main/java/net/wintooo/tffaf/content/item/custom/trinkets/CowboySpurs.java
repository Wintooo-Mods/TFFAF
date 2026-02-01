package net.wintooo.tffaf.content.item.custom.trinkets;


import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;
import java.util.Objects;

public class CowboySpurs extends TrinketItem {
  @Override
  public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
    super.appendTooltip(stack, world, tooltip, context);
    tooltip.add(Text.translatable("text.cowboy_spurs"));
  }
  public CowboySpurs(Settings settings) {
    super(settings);
  }


  @Override
  public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
    if(entity.hasVehicle()
            && Objects.requireNonNull(entity.getVehicle()).isLiving()
            && (entity.getVehicle().isOnGround())
    )
    {
      entity.getVehicle().setVelocity(entity.getVehicle().getVelocity().multiply(1.2,1,1.2));
    }
  }
}