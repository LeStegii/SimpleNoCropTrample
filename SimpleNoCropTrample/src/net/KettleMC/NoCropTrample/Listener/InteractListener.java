package net.KettleMC.NoCropTrample.Listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractListener implements Listener{
	


	@EventHandler
	public void onPlayerInteractEvent(PlayerInteractEvent e) {

		if (e.getAction() == Action.PHYSICAL && e.getClickedBlock().getType().equals(Material.SOIL)) {
			e.setCancelled(true);
		}
	}




}
