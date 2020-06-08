package tk.appleflavored.luamc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MainCommand implements CommandExecutor {

    private LuaMC plugin;

    public MainCommand(LuaMC plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args[0].equalsIgnoreCase("reload")) {
            if (args[1] != null) {
                if (args[1].equalsIgnoreCase("all")) {
                    plugin.getEnvironment().loadScripts();
                }
                plugin.getEnvironment().reloadScript();
            }
        } else if (args[0].equalsIgnoreCase("enable")) {

        } else if (args[0].equalsIgnoreCase("disable")) {

        } else {
            sender.sendMessage(new String[] {
                    "§3LuaMC Help:",
                    "§b/lua reload §7- Reloads a script.",
                    "§b/lua enable §7- Enable a script.",
                    "§b/lua disable §7- Disable a script."
            });
        }

        return true;
    }

}
