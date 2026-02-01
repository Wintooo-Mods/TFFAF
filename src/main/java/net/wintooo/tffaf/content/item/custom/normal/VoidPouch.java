package net.wintooo.tffaf.content.item.custom.normal;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.wintooo.tffaf.content.screens.VoidPouchScreenHandler;

import java.util.List;

public class VoidPouch extends Item {

    private static final Text CONTAINER_NAME =
            Text.translatable("container.enderchest");

    public VoidPouch(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("text.void_pouch"));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (world.isClient) {
            return TypedActionResult.success(stack);
        }

        user.openHandledScreen(new SimpleNamedScreenHandlerFactory(
                (syncId, inventory, player) ->
                        new VoidPouchScreenHandler(
                                syncId,
                                inventory,
                                user.getEnderChestInventory()
                        ),
                CONTAINER_NAME
        ));

        world.playSoundFromEntity(
                null,
                user,
                SoundEvents.BLOCK_ENDER_CHEST_OPEN,
                SoundCategory.PLAYERS,
                0.5F,
                world.random.nextFloat() * 0.1F + 0.9F
        );

        user.incrementStat(Stats.OPEN_ENDERCHEST);
        return TypedActionResult.success(stack);
    }
}