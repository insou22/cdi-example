package net.voldex.cdiexample;

import com.google.inject.Binder;

import net.voldex.cdiexample.bind.HelloWorld;
import net.voldex.common.spigot.inject.plugin.VoldexPlugin;
import net.voldex.common.spigot.plugin.auto.Plugin;
import net.voldex.cdiexample.player.PlayerModule;

@Plugin(version = "1.0.0")
public class TestPlugin extends VoldexPlugin {

	@Override
	public void configure(Binder binder) {
		binder.bind(String.class).annotatedWith(HelloWorld.class).toInstance("Hello, World!");
	}

	@Override
	public void enable() {
		this.install(PlayerModule.class);
	}

}
