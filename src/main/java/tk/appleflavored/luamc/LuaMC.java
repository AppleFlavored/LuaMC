package tk.appleflavored.luamc;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class LuaMC extends JavaPlugin {

    private LuaEnvironment env;

    @Override
    public void onEnable() {

        File scriptsDir = new File(getDataFolder(), "/scripts");
        if (!scriptsDir.exists()) {
            if (scriptsDir.mkdirs()) getLogger().info("Created scripts directory.");
        }

        env = new LuaEnvironment(scriptsDir);
        env.loadScripts();
    }

    public LuaEnvironment getEnvironment() {
        return env;
    }

}
