package tk.appleflavored.luamc.objects;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class LuaPlayer {

    private Player player;

    public LuaPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return player.getLocation();
    }

    public void teleport(Location location) {
        return player.t
    }

}
