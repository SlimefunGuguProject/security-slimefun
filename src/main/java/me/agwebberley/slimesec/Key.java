package me.agwebberley.slimesec;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class Key extends SlimefunItem {
    public Key(ItemGroup itemGroup, SlimefunItemStack keyItemStack, RecipeType recipeType, ItemStack[] keyrecipe) {
        super(itemGroup, keyItemStack, recipeType, keyrecipe);
    }
}