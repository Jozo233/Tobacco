package ml.jozo.tobacco;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

import ml.jozo.tobacco.categories.Categories;
import ml.jozo.tobacco.commands.TobaccoCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Tobacco extends JavaPlugin implements SlimefunAddon {

    public static Tobacco instance;

    public static Tobacco inst(){
        return instance;
    }

    @Override
    public JavaPlugin getJavaPlugin(){
        return this;
    }

    @Override
    public void onEnable() {

        instance = this;


        getLogger().info("######################################");
        getLogger().info("#          Tobaco by Jozo_85         #");
        getLogger().info("#  SlimeFun addon thats add Tobacco  #");
        getLogger().info("######################################");

        this.getCommand("tobacco").setExecutor(new TobaccoCommand());


        setupSlimefun();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }

    private void setupSlimefun(){
        Categories.set(this);
    }
}
