
package net.mcreator.mysticalrealms.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.mysticalrealms.itemgroup.MysticalRealmsItemGroup;
import net.mcreator.mysticalrealms.MysticalrealmsModElements;

import java.util.List;
import java.util.Collections;

@MysticalrealmsModElements.ModElement.Tag
public class SimpleMachineCasingBlock extends MysticalrealmsModElements.ModElement {
	@ObjectHolder("mysticalrealms:simple_machine_casing")
	public static final Block block = null;
	public SimpleMachineCasingBlock(MysticalrealmsModElements instance) {
		super(instance, 168);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(MysticalRealmsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("simple_machine_casing");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
