package net.voldex.cdiexample.player;

import com.google.inject.Inject;

import net.voldex.common.spigot.inject.initialize.Initialize;
import net.voldex.common.spigot.inject.module.Module;
import net.voldex.cdiexample.TestPlugin;

public final class PlayerModule extends Module {

	@Inject private TestPlugin plugin;

	@Initialize
	private void init() {
		this.install(OtherModule.class);
		this.install(PlayerJoinListener.class);
		this.install(PlayerQuitListener.class);
	}

}
