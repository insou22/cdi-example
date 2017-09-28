package net.voldex.cdiexample.auto;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import net.voldex.common.inject.discover.Discover;

@Discover
final class PlayerInteractListener implements Listener {

	@EventHandler
	public void on(PlayerInteractEvent event) {
		event.getPlayer().sendMessage("I was automatically installed");
	}

}
