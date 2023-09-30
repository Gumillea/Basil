package com.gumillea.basil.common.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.*;
import net.minecraft.world.level.LevelAccessor;

import java.util.Map;

public class PhototaxisEffect extends MobEffect {
    public PhototaxisEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFF6333);
        this.addAttributeModifier(Attributes.ATTACK_SPEED, "57A79E5A-56D2-B639-E7D5-4A0A09FADC6A", 0.04F, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap map, int amplifier) {
        if (!entity.level.isClientSide) {
            BlockPos pos = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
            LevelAccessor world = entity.level;
            int light = world.getRawBrightness(pos, world.getSkyDarken());
            float amount = light * (amplifier + 1) * 0.5F;
            for (Map.Entry<Attribute, AttributeModifier> entry : this.getAttributeModifiers().entrySet()) {
                AttributeInstance instance = map.getInstance(entry.getKey());
                if (instance != null) {
                    AttributeModifier modifier = entry.getValue();
                    instance.removeModifier(modifier);
                    instance.addPermanentModifier(new AttributeModifier(modifier.getId(),
                            this.getDescriptionId() + " " + amplifier,
                            amount * this.getAttributeModifierValue(amplifier, modifier),
                            modifier.getOperation()));
                }
            }
        }
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        this.addAttributeModifiers(entity, entity.getAttributes(), amplifier);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}