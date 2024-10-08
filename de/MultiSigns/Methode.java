package de.MultiSigns;

import org.bukkit.block.Sign;

public class Methode {
   public static void MaintenaceOn(Sign a) {
      a.setLine(0, "§8§m--§4§l✖§8§m--");
      a.setLine(1, Main.getProvidingPlugin(Main.class).getConfig().getString("Maintenace.Line2").replace("&", "§"));
      a.setLine(3, "§8§m--§4§l✖§8§m--");
      a.update();
   }
}
