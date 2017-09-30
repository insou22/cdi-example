package net.voldex.cdiexample.auto;

import java.util.logging.Logger;

import com.google.inject.Inject;

import net.voldex.cdiexample.bind.HelloWorld;
import net.voldex.common.inject.discover.Discover;
import net.voldex.common.inject.initialize.Initialize;
import net.voldex.common.spigot.inject.module.Module;
import net.voldex.common.spigot.inject.plugin.PluginLogger;

@Discover
final class AutoModule extends Module {

	@Inject @PluginLogger private Logger logger;
	@Inject @HelloWorld private String helloWorld;

	@Initialize
	private void init() {
		this.logger.info("AutoModule says " + this.helloWorld);
	}

}
