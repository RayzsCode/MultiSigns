package de.MultiSigns;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class Create_LISTENER implements Listener {
   @EventHandler
   public void onSignChange(SignChangeEvent a) {
      Player var2 = a.getPlayer();
      String var3 = a.getLine(1);
      if (a.getLine(0) != null && a.getLine(0) != "" && a.getLine(0).equalsIgnoreCase("[MultiSigns]") && var2.hasPermission("MultiSigns.create")) {
         a.setLine(2, a.getLine(1));
         a.setLine(0, "§7§m---------");
         a.setLine(3, "§7§m---------");
         a.setLine(1, Main.getProvidingPlugin(Main.class).getConfig().getString("SIGN.Line2").replace("&", "§"));
         if (a.getLine(2).isEmpty()) {
            var2.sendMessage("§cWrong world...");
            a.setLine(0, "§c/MultiSigns Tutorial"));
            a.setLine(1, "§cWRONG WORLD");
            a.setLine(2, "§cWRONG WORLD");
            a.setLine(3, "§cWRONG WORLD");
            return;
         }

         var2.sendMessage("§aYou have succesfully created a sign for the world §e") + var3);
      }

   }
}
