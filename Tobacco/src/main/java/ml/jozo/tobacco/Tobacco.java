package ml.jozo.tobacco;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

import ml.jozo.tobacco.commands.TobaccoCommand;
import ml.jozo.tobacco.items.Filter;
import ml.jozo.tobacco.items.Pipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Tobacco extends JavaPlugin implements SlimefunAddon {

    @Override
    public JavaPlugin getJavaPlugin(){
        return this;
    }

    @Override
    public void onEnable() {
        new Filter(this);
        new Pipe(this);

        getLogger().info("######################################");
        getLogger().info("#          Tobaco by Jozo_85         #");
        getLogger().info("#  SlimeFun addon thats add Tobacco  #");
        getLogger().info("######################################");

        this.getCommand("tobacco").setExecutor(new TobaccoCommand());

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
