
package net.mcreator.mysticalrealms.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.mysticalrealms.MysticalrealmsModElements;

@MysticalrealmsModElements.ModElement.Tag
public class TopaztoolsPickaxeItem extends MysticalrealmsModElements.ModElement {
	@ObjectHolder("mysticalrealms:topaztools_pickaxe")
	public static final Item block = null;
	public TopaztoolsPickaxeItem(MysticalrealmsModElements instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("topaztools_pickaxe"));
	}
}
