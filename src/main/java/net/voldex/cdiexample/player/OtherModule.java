package net.voldex.cdiexample.player;

import java.util.logging.Logger;

import com.google.inject.Inject;

import net.voldex.common.spigot.inject.initialize.Initialize;
import net.voldex.common.spigot.inject.module.Module;
import net.voldex.common.spigot.inject.plugin.PluginLogger;

final class OtherModule extends Module {

	private final Logger logger;

	@Inject
	private OtherModule(@PluginLogger Logger logger) {
		this.logger = logger;
	}

	@Initialize
	private void init() {
		this.logger.info("Injected variables can be final too");
	}

}
