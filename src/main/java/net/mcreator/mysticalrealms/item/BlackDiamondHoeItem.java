
package net.mcreator.mysticalrealms.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.mysticalrealms.MysticalrealmsModElements;

@MysticalrealmsModElements.ModElement.Tag
public class BlackDiamondHoeItem extends MysticalrealmsModElements.ModElement {
	@ObjectHolder("mysticalrealms:black_diamond_hoe")
	public static final Item block = null;
	public BlackDiamondHoeItem(MysticalrealmsModElements instance) {
		super(instance, 53);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("black_diamond_hoe"));
	}
}
