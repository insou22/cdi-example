package net.voldex.cdiexample.player;

import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.google.inject.Inject;

import net.voldex.common.spigot.inject.plugin.PluginLogger;

final class PlayerJoinListener implements Listener {

	@Inject @PluginLogger private Logger logger;

	@EventHandler
	public void on(PlayerJoinEvent event) {
		this.logger.info(event.getPlayer().getName() + " joined from event.");
	}

}
