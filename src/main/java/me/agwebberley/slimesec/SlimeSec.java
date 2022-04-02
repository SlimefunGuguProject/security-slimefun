package me.agwebberley.slimesec;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class SlimeSec extends JavaPlugin implements SlimefunAddon {

    public static SlimeSec getPlugin() {
        return plugin;
    }

    private static SlimeSec plugin;
    @Override
    public void onEnable() {
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
        }

        ItemStack itemGroupItem = new CustomItemStack(Material.IRON_DOOR, "&4SlimeSec", "", "&a> Click to open");

        NamespacedKey itemGroupId = new NamespacedKey(this, "slimesec");
        ItemGroup itemGroup = new ItemGroup(itemGroupId, itemGroupItem);

        SlimefunItemStack slimefunItem = new SlimefunItemStack("SECURITY_DOOR", Material.IRON_DOOR, "&4Unbreakable Security Door", "");

        ItemStack[] recipe = { null, new ItemStack(Material.IRON_INGOT), new ItemStack(Material.DIAMOND), null, new ItemStack(Material.IRON_INGOT), new ItemStack(Material.DIAMOND), null, new ItemStack(Material.IRON_INGOT), new ItemStack(Material.DIAMOND) };

        SecurityDoor door = new SecurityDoor(itemGroup, slimefunItem, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        door.register(this);

        SlimefunItemStack KeyItemStack = new SlimefunItemStack("SECURITY_KEY", Material.SPECTRAL_ARROW, "&4Security Door Key", "");

        ItemStack[] Keyrecipe = { null, new ItemStack(Material.IRON_INGOT), new ItemStack(Material.DIAMOND), null, new ItemStack(Material.IRON_INGOT), new ItemStack(Material.DIAMOND), null, new ItemStack(Material.IRON_INGOT), new ItemStack(Material.DIAMOND) };

        Key key = new Key(itemGroup, KeyItemStack, RecipeType.ENHANCED_CRAFTING_TABLE, Keyrecipe);
        door.register(this);
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}
