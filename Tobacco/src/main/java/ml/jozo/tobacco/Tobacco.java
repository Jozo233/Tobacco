package ml.jozo.tobacco;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.unirest.Config;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

public class Tobacco extends JavaPlugin implements SlimefunAddon {

    @Override
    public JavaPlugin getJavaPlugin(){
        return this;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        Config cfg = new Config(this);

        NamespacedKey categoryId = new NamespacedKey(this, "tobacco");
        CustomItemStack stackId = new CustomItemStack(Material.ACACIA_LEAVES, "&4Tobacco Plans and thing from it");

        ItemGroup itemGroup = new ItemGroup(categoryId, stackId);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }
}
