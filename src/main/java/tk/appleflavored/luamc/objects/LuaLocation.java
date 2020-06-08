package tk.appleflavored.luamc.objects;

import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ThreeArgFunction;

public class LuaLocation extends LuaTable {

    public LuaLocation() {
        set("Location:new", new ThreeArgFunction() {
            @Override
            public LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
                int x = arg1.checkint();
                int y = arg2.checkint();
                int z = arg3.checkint();

                return null;
            }
        });
    }

}
