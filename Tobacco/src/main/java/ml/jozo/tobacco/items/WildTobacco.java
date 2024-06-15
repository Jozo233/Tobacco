package ml.jozo.tobacco.items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import jdk.tools.jlink.plugin.Plugin;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class WildTobacco {

    public static void register(Plugin plugin){
        NamespacedKey categoryId = new NamespacedKey(this, "tobacco");
        CustomItemStack stackId = new CustomItemStack(Material.ACACIA_LEAVES, "&4Tobacco Plans and thing from it");

        ItemGroup itemGroup = new ItemGroup(categoryId, stackId);

        SlimefunItemStack itemStack = new  SlimefunItemStack("WILD_TOBBCO", Material.ALLIUM, "Wild Tobacco",  "&8A rare herb found in grass");
        ItemStack[] recipe = {};
        SlimefunItem sfItem = new SlimefunItem(itemGroup, itemStack, RecipeType.NULL, recipe);
        sfItem.register(plugin);


    }
}
