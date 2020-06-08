package tk.appleflavored.luamc.objects;

import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.TwoArgFunction;

public class LuaServer extends LuaTable {

    public LuaServer() {
        // TODO: finish this
        set("registerEvent", new TwoArgFunction() {
            @Override
            public LuaValue call(LuaValue arg1, LuaValue arg2) {
                return null;
            }
        });

    }

}
