package me.agwebberley.slimesec;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

import java.util.logging.Logger;


public class SecurityDoor extends SlimefunItem {
    public SecurityDoor(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }
    @Override
    public void preRegister() {


        BlockUseHandler blockUseHandler = this::onBlockRightClick;
        addItemHandler(blockUseHandler);

        ItemUseHandler itemUseHandler = this::onItemRightClick;
        addItemHandler(itemUseHandler);
    }

    private void onBlockRightClick(PlayerRightClickEvent event) {
        Logger logger = Bukkit.getLogger();
        logger.config("Right Click Block Event");
        logger.info(String.valueOf(event.getPlayer().getMainHand()));
    }

    private void onItemRightClick(PlayerRightClickEvent event) {
        /*ItemMeta itemmeta = event.getPlayer().getItemInUse().getItemMeta();
        String PlayerUUid = String.valueOf(event.getPlayer().getUniqueId());
        PersistentDataContainer data = event.getPlayer().getItemInUse().getItemMeta().getPersistentDataContainer();

        if (data.has(new NamespacedKey(SlimeSec.getPlugin(), "owner"), PersistentDataType.STRING)) {
            return;
        } else {
            data.set(new NamespacedKey(SlimeSec.getPlugin(), "owner"), PersistentDataType.STRING, PlayerUUid);
        }
         */

        // if (event.getPlayer().getMainHand())
        Bukkit.getLogger().config("Right Click Item Event");
        Bukkit.getLogger().info(String.valueOf(event.getPlayer().getMainHand()));
    }
}
