package com.bewitchment.proxy;

import com.bewitchment.client.render.entity.living.*;
import com.bewitchment.client.render.entity.spirit.demon.*;
import com.bewitchment.client.render.entity.spirit.ghost.RenderBlackDog;
import com.bewitchment.client.render.tile.RenderTileEntityJuniperChest;
import com.bewitchment.client.render.tile.RenderTileEntityPlacedItem;
import com.bewitchment.common.block.BlockGlyph;
import com.bewitchment.common.block.tile.entity.TileEntityJuniperChest;
import com.bewitchment.common.block.tile.entity.TileEntityPlacedItem;
import com.bewitchment.common.entity.living.*;
import com.bewitchment.common.entity.spirit.demon.*;
import com.bewitchment.common.entity.spirit.ghost.EntityBlackDog;
import com.bewitchment.registry.ModObjects;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import java.util.List;
import java.util.function.Predicate;

@SuppressWarnings({"ConstantConditions", "unused"})
public class ClientProxy extends ServerProxy {
	@Override
	public boolean isFancyGraphicsEnabled() {
		return Minecraft.getMinecraft().gameSettings.fancyGraphics;
	}
	
	@Override
	public void registerColorOverrides() {
		Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler((state, world, pos, tintIndex) -> {
			int type = state.getValue(BlockGlyph.TYPE);
			return type == BlockGlyph.GOLDEN ? 0xe3dc3c : type == BlockGlyph.NETHER ? 0xbb0000 : type == BlockGlyph.ENDER ? 0x770077 : 0xffffff;
		}, ModObjects.glyph);
		Minecraft.getMinecraft().getItemColors().registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? 0xe6c44f : 0xffffff, ModObjects.snake_venom);
		Minecraft.getMinecraft().getItemColors().registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? 0x717d39 : 0xffffff, ModObjects.liquid_wroth);
	}
	
	@Override
	public void registerEntityRenderers() {
		//		RenderingRegistry.registerEntityRenderingHandler(EntityCypressBroom.class, RenderCypressBroom::new);
		//		RenderingRegistry.registerEntityRenderingHandler(EntityElderBroom.class, RenderElderBroom::new);
		//		RenderingRegistry.registerEntityRenderingHandler(EntityJuniperBroom.class, RenderJuniperBroom::new);
		//		RenderingRegistry.registerEntityRenderingHandler(EntityYewBroom.class, RenderYewBroom::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLizard.class, RenderLizard::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNewt.class, RenderNewt::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityOwl.class, RenderOwl::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityRaven.class, RenderRaven::new);
		RenderingRegistry.registerEntityRenderingHandler(EntitySnake.class, RenderSnake::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityToad.class, RenderToad::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBlackDog.class, RenderBlackDog::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityHellhound.class, RenderHellhound::new);
		RenderingRegistry.registerEntityRenderingHandler(EntitySerpent.class, RenderSerpent::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDemon.class, RenderDemon::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityDemoness.class, RenderDemoness::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityImp.class, RenderImp::new);
		
		//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWitchesCauldron.class, new RenderTileEntityWitchesCauldron());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJuniperChest.class, new RenderTileEntityJuniperChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPlacedItem.class, new RenderTileEntityPlacedItem());
	}
	
	@Override
	public void registerTexture(Item item, String variant) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), variant));
	}
	
	@Override
	public void registerTextureVariant(Item item, List<Predicate<ItemStack>> predicates) {
		ResourceLocation[] names = new ResourceLocation[predicates.size() + 1];
		for (int i = 0; i <= predicates.size(); i++)
			names[i] = new ResourceLocation(item.getRegistryName().toString() + (i == 0 ? "" : "_variant" + (predicates.size() == 1 ? "" : (i - 1))));
		ModelBakery.registerItemVariants(item, names);
		ModelLoader.setCustomMeshDefinition(item, stack -> {
			for (int i = 0; i < predicates.size(); i++)
				if (predicates.get(i).test(stack)) return new ModelResourceLocation(names[i + 1], "inventory");
			return new ModelResourceLocation(item.getRegistryName(), "inventory");
		});
	}
	
	@Override
	public void ignoreProperty(Block block, IProperty<?>... properties) {
		ModelLoader.setCustomStateMapper(block, new StateMap.Builder().ignore(properties).build());
	}
}