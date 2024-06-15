package ml.jozo.tobacco;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

import io.github.thebusybiscuit.slimefun4.libraries.unirest.Config;
import ml.jozo.tobacco.items.WildTobacco;
import ml.jozo.tobacco.items.Tobacco
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

        new WildTobacco(this);


        new ml.jozo.tobacco.items.Tobacco(this);

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
