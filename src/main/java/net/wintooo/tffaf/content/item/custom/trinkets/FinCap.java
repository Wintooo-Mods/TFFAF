package net.wintooo.tffaf.content.item.custom.trinkets;


import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class FinCap extends TrinketItem {
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(Text.translatable("text.fin_cap"));
    }
    public FinCap(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if(entity.isCrawling()){
            entity.setVelocity(entity.getVelocity().multiply(1.25,1.25,1.25));
        }
        if(entity.isSwimming()){
            entity.setVelocity(entity.getVelocity().multiply(1.07,1.07,1.07));
        }
    }
}