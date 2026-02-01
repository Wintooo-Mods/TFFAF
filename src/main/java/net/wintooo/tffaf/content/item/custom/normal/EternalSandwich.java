package net.wintooo.tffaf.content.item.custom.normal;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.List;

public class EternalSandwich extends Item {

    public EternalSandwich(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("text.eternal_sandwich"));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (!user.canConsume(true)) {
            return TypedActionResult.fail(stack);
        }

        user.setCurrentHand(hand);
        return TypedActionResult.consume(stack);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient && user instanceof PlayerEntity player) {
            player.getHungerManager().add(1, 0.0F);

            world.playSound(
                    null,
                    user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_GENERIC_EAT,
                    SoundCategory.NEUTRAL,
                    1.0F,
                    1.0F + (world.random.nextFloat() - world.random.nextFloat()) * 0.4F
            );

            user.emitGameEvent(GameEvent.EAT);
        }

        return stack;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 35;
    }
}