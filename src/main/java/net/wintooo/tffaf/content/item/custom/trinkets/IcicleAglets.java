package net.wintooo.tffaf.content.item.custom.trinkets;


import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class IcicleAglets extends TrinketItem {
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(Text.translatable("text.icicle_aglets"));
    }
    public IcicleAglets(Settings settings) {
        super(settings);
    }
    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if(entity.isOnGround() && entity.getSteppingBlockState().getBlock().getSlipperiness() < 0.7f)
        {
            entity.setVelocity(entity.getVelocity().multiply(0.75,1,0.75));
            entity.setNoDrag(true);
        }
        else {
            entity.setNoDrag(false);
        }
        if(entity.isOnGround() && entity.getSteppingBlockState().getBlock().getSlipperiness() >= 0.7f)
        {
            entity.setVelocity(entity.getVelocity().multiply(1.15,1,1.15));
        }
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.setNoDrag(false);
    }
}