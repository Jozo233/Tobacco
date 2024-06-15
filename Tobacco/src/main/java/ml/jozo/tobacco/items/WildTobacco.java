package ml.jozo.tobacco.items;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class WildTobacco extends SlimefunItem {

    public WildTobacco(SlimefunAddon addon){
        super(addon, new SlimefunItemStack("WILD_TOBACCO", Material.ALLIUM, "&6Wild Tobacco"), RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, new ItemStack(Material.SHEARS), null, null, new SlimefunItemStack("TOBACCO", Material.CORNFLOWER), null});
        register(addon);
    }
}
