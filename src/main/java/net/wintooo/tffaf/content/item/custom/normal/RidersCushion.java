package net.wintooo.tffaf.content.item.custom.normal;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.List;

public class RidersCushion extends Item {

    public RidersCushion(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("text.riders_cushion"));
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        World world = user.getWorld();

        if (!world.isClient) {
            boolean mounted = user.startRiding(entity);

            if (mounted) {
                world.playSoundFromEntity(
                        null,
                        user,
                        SoundEvents.ENTITY_CAMEL_SADDLE,
                        SoundCategory.PLAYERS,
                        0.5F,
                        world.random.nextFloat() * 0.1F + 0.9F
                );
            }

            return mounted ? ActionResult.SUCCESS : ActionResult.PASS;
        }

        return ActionResult.SUCCESS;
    }
}
