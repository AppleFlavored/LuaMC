package tk.appleflavored.luamc;

import org.bukkit.Bukkit;
import org.luaj.vm2.*;
import org.luaj.vm2.compiler.LuaC;
import org.luaj.vm2.lib.*;
import org.luaj.vm2.lib.jse.*;

import java.io.File;
import java.util.Objects;

public class LuaEnvironment {

    private final File scriptsDir;
    private final Globals globals;
    private long loadTime;

    public LuaEnvironment(File scriptsDir) {
        this.scriptsDir = scriptsDir;

        globals = new Globals();
        globals.load(new JseBaseLib());
        globals.load(new PackageLib());
        globals.load(new Bit32Lib());
        globals.load(new TableLib());
        globals.load(new StringLib());
        globals.load(new CoroutineLib());
        globals.load(new JseMathLib());
        LoadState.install(globals);
        LuaC.install(globals);
    }

    public void loadScripts() {
        for (File file : Objects.requireNonNull(scriptsDir.listFiles())) {
            if (!file.getName().startsWith("-") && file.getName().endsWith(".lua")) {
                LuaValue chunk = globals.loadfile(file.getPath());
                chunk.call();
            }
        }
    }

    public void reloadScript(String name) {
        LuaValue chunk = globals.loadfile(new File(scriptsDir, name).getPath());
        chunk.call();
    }

    public long getLoadTime() {
        return loadTime;
    }

}
