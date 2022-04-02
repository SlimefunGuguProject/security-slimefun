package me.agwebberley.slimesec;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;

public class Key extends SlimefunItem {
    public Key(ItemGroup itemGroup, SlimefunItemStack keyItemStack, RecipeType recipeType, ItemStack[] keyrecipe) {
        super(itemGroup, keyItemStack, recipeType, keyrecipe);
    }
    @Override
    public void preRegister() {
        ItemUseHandler itemUseHandler = this::onItemRightClick;
        addItemHandler(itemUseHandler);
    }

    private void onItemRightClick(PlayerRightClickEvent playerRightClickEvent) {

    }
}