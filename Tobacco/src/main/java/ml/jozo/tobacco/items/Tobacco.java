package ml.jozo.tobacco.items;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Tobacco extends SlimefunItem {
    public Tobacco(SlimefunAddon addon) {
        super(addon, new SlimefunItemStack("TOBACCO", Material.CORNFLOWER, "&6Tobacco"), RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, new ItemStack(Material.WHEAT_SEEDS), null, new ItemStack(Material.DIAMOND), new SlimefunItemStack("WILD_TOBACCO", Material.ALLIUM), new ItemStack(Material.DIAMOND), null, new ItemStack(Material.WHEAT_SEEDS), null});
        register(addon);

    }
}
