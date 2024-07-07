package ml.jozo.tobacco.items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public final class ItemStack {

    private ItemStack(){
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack EMPTY_CREATE = new SlimefunItemStack(
            "EMPTY_CREATE",
            Skulls.EMPTYCREATE
    )
}