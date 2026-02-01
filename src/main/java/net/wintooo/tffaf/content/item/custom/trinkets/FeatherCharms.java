package net.wintooo.tffaf.content.item.custom.trinkets;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.List;

public class FeatherCharms extends TrinketItem {

    public FeatherCharms(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("text.feather_charms"));
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.getWorld();

        if (!entity.isSprinting()
                || entity.isOnGround()
                || entity.isSneaking()) {
            return;
        }

        Vec3d velocity = entity.getVelocity();

        if (velocity.y < 0) {
            double newY = Math.max(velocity.y * 0.85, -0.25);

            Vec3d look = entity.getRotationVector().multiply(0.02);

            entity.setVelocity(
                    velocity.x + look.x,
                    newY,
                    velocity.z + look.z
            );

            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.SLOW_FALLING,
                    10,
                    0,
                    true,
                    false
            ));

            if (world.isClient) {
                Random random = world.random;
                world.addParticle(
                        ParticleTypes.CLOUD,
                        entity.getX(),
                        entity.getY(),
                        entity.getZ(),
                        0.1 - random.nextFloat() * 0.2,
                        0.02,
                        0.1 - random.nextFloat() * 0.2
                );
            }
        }
    }
}
