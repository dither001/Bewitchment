package com.bewitchment.common.ritual;

import com.bewitchment.Bewitchment;
import com.bewitchment.Util;
import com.bewitchment.api.registry.Ritual;
import com.bewitchment.common.block.BlockGlyph;
import com.bewitchment.common.world.BiomeChangingUtils;
import com.bewitchment.registry.ModObjects;
import net.minecraft.block.BlockDirt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.items.ItemStackHandler;

import java.util.Arrays;

/**
 * Original code by Zabi94, modified by Sunconure11 afterwards, with bits stuck on from Ael.
 */
public class RitualSowingSalt extends Ritual {
    public RitualSowingSalt() {
        super(new ResourceLocation(Bewitchment.MODID, "sowing_salt"), Arrays.asList(Util.get("salt"), Util.get("salt"), Util.get(ModObjects.demon_heart), Util.get(ModObjects.opal), Util.get(ModObjects.pentacle), Util.get(new ItemStack(ModObjects.ebb_of_death)), Util.get(new ItemStack(ModObjects.dimensional_sand)), Util.get(new ItemStack(ModObjects.lizard_leg))), null, null, true, 150, 1600, 75, BlockGlyph.ENDER, BlockGlyph.ENDER, BlockGlyph.ENDER);
    }

    public Biome getSaltedBiome() {
        return Biomes.DESERT;
    }

    @Override
    public void onFinished(World world, BlockPos altarPos, BlockPos effectivePos, EntityPlayer caster, ItemStackHandler inventory) {
        int radius = 32;
        for (double x = -radius; x < radius; x++) {
            for (double z = -radius; z < radius; z++) {
                if (Math.sqrt((x * x) + (z * z)) < radius) {
                    BlockPos pos = effectivePos.add(x, -1, z);
                    BiomeChangingUtils.setBiome(world, getSaltedBiome(), pos);
                    world.setBlockState(pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT), 3);
                }
            }
        }
    }
}