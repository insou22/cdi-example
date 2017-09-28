package net.voldex.cdiexample.player;

import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.google.inject.Inject;

import net.voldex.common.spigot.inject.plugin.PluginLogger;

public class PlayerQuitListener implements Listener {

	@Inject @PluginLogger private Logger logger;

	@EventHandler
	public void on(PlayerQuitEvent event) {
		this.logger.info(event.getPlayer().getName() + " quit from event.");
	}

}
