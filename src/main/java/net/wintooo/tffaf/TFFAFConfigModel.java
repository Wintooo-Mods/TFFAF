package net.wintooo.tffaf;

import io.wispforest.owo.config.annotation.*;

@Modmenu(modId = "tffaf")
@Config(name = "tffaf", wrapperName = "TFFAFConfig")
public class TFFAFConfigModel {
    @Nest
    @Expanded
    public EffectLevel effectLevels = new EffectLevel();
    public static class EffectLevel {
        @RangeConstraint(min = 1, max = 255)
        public int ironGauntlet = 1;
        @RangeConstraint(min = 1, max = 255)
        public int luckyPickaxeHead = 2;
        @RangeConstraint(min = 1, max = 255)
        public int rabbitsCharm = 4;
        @RangeConstraint(min = 1, max = 255)
        public int runningShoes = 2;
        @RangeConstraint(min = 1, max = 255)
        public int tetheredSoul = 1;
    }
}