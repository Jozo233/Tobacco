package ml.jozo.tobacco.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TobaccoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (args.length == 0){
            sender.sendMessage(ChatColor.RED + "[" + ChatColor.WHITE + "Tobbacco" + ChatColor.RED + "]" + "SlimeFun addond that add tobacco and product from it like cigars, snus and some types of drugs like ganja and more");
            sender.sendMessage(ChatColor.RED + "[" + ChatColor.WHITE + "Tobbacco" + ChatColor.RED + "]" + "Author: Jozo233 Develop by ViktoriaSoftwares - MC DEVELOP");
        } else if (args.length == 1 && args[0].equalsIgnoreCase("support")){
            sender.sendMessage("Discord server: https://discord.gg/nVkUEa9h");
            sender.sendMessage("Viktoria Software - MC DEVELOPE: https://l.ai-books.eu/ds");
            sender.sendMessage("Docs: https://mcdevelope.docs.ai-books.eu/slimefun/tobbacco");
            sender.sendMessage("Github issues: https://github.com/Jozo233/Tobacco/issues");
        }

        return true;
    }
}
