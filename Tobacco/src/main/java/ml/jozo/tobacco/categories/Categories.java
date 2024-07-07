package ml.jozo.tobacco.categories;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import ml.jozo.tobacco.Tobacco;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Categories {
    private Categories() {
        throw new IllegalStateException("Utility class");
    }

    public static CustomItemStack tobbacoMain() {
        return new CustomItemStack(
                Material.ACACIA_SAPLING,
                "Tobacco, Items and machine"
        );
    }

    public static CustomItemStack tobbacoItems(){
        return new CustomItemStack(
                Material.STICK,
                "Items"
        );
    }

    public final static NestedItemGroup CORE = new NestedItemGroup(new NamespacedKey(Tobacco.inst(), "tobacco"), tobbacoMain());
    public final static SubItemGroup ITM = new SubItemGroup(new NamespacedKey(Tobacco.inst(), "tobacco-itesm"), CORE, tobbacoItems());

    public static void set(Tobacco p){
        CORE.register(p);
        ITM.register(p);
    }
}
