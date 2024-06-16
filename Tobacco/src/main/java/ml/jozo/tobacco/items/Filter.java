package ml.jozo.tobacco.items;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Filter extends SlimefunItem {

    public Filter(SlimefunAddon addon){
        super((ItemGroup) addon, new SlimefunItemStack("FILTER", Material.BRICK, "&6Brick"), RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, new ItemStack(Material.PAPER), SlimefunItems.CARBON,  new ItemStack(Material.PAPER), null, null, null});
        register(addon);
    }
}
