package com.genife.noelytrafly.Listeners;

import com.genife.noelytrafly.NoElytraFly;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;

public class FlyListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST)
    public void onElytraFly(EntityToggleGlideEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Player) {
            Player player = (Player) entity;
            player.sendActionBar(Component.text(NoElytraFly.DISABLED_MESSAGE));
            event.setCancelled(true);
        }
    }
}
