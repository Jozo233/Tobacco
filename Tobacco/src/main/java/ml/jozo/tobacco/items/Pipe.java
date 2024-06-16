package ml.jozo.tobacco.items;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Pipe extends SlimefunItem {

    public Pipe(SlimefunAddon addon){
        super((ItemGroup) addon, new SlimefunItemStack("PIPE", Material.STICK, "&4Pipe", "You can smoke wild tobbacco with it"), RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, new ItemStack(Material.STICK), null, null, new ItemStack(Material.STICK), null, null, new ItemStack(Material.STICK), new ItemStack(Material.STICK)});
        register(addon);
    }
}
