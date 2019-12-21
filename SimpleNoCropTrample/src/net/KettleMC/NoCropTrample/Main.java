package net.KettleMC.NoCropTrample;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.KettleMC.NoCropTrample.Listener.InteractListener;

public class Main extends JavaPlugin {
	
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new InteractListener(), this);
	}

	

}
