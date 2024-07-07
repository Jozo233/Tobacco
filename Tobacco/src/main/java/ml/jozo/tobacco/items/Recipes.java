package ml.jozo.tobacco.items;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Recipes {

    private Recipes() {
        throw new IllegalStateException("Utility class");
    }

    protected static final ItemStack[] EMPTY_CREATE = new ItemStack[]{
            new ItemStack(Material.PAPER), null, new ItemStack(Material.PAPER),
            new ItemStack(Material.PAPER), null, new ItemStack(Material.PAPER),
            new ItemStack(Material.BAMBOO), new ItemStack(Material.PAPER), new ItemStack(Material.BAMBOO)
    };

}
