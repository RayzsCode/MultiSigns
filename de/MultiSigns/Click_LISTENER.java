package de.MultiSigns;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Click_LISTENER implements Listener {
   @EventHandler
   public void onJoin(PlayerInteractEvent a) {
      Player var2 = a.getPlayer();
      if (a.getAction() == Action.RIGHT_CLICK_BLOCK && !var2.isSneaking() && a.getClickedBlock().getState() instanceof Sign) {
         Sign a;
         Sign var10000 = a = (Sign)a.getClickedBlock().getState();
         String var3;
         World var4 = Bukkit.getWorld(var3 = var10000.getLine(2));
         if (var10000.getLine(0).equalsIgnoreCase("§7§m---------"))) {
            if (var4.getWorldFolder().exists()) {
               var2.sendMessage(Main.getProvidingPlugin(Main.class).getConfig().getString("Messages.Join")).replace("%worldname%"), var3).replace("&", "§"));
               var2.teleport(var4.getSpawnLocation());
               a.update();
               return;
            }

            var2.sendMessage(Main.getProvidingPlugin(Main.class).getConfig().getString("Messages.Error")).replace("%worldname%"), var3).replace("&", "§"));
         }
      }

   }

   @EventHandler
   public void onMaintenance(PlayerInteractEvent a) {
      Player var2 = a.getPlayer();
      if (a.getAction() == Action.RIGHT_CLICK_BLOCK && var2.isSneaking() && var2.hasPermission("MultiSigns.Maintenance")) && a.getClickedBlock().getState() instanceof Sign) {
         Sign a;
         Sign var10000 = a = (Sign)a.getClickedBlock().getState();
         String var3 = var10000.getLine(2);
         if (var10000.getLine(0).equalsIgnoreCase("§7§m---------"))) {
            var2.sendMessage(Main.prefix + "§cYou set the Sign §4") + var3 + "§c in maintenace...");
            Methode.MaintenaceOn(a);
            a.update();
            return;
         }

         if (a.getLine(0).equalsIgnoreCase("§8§m--§4§l✖§8§m--")) {
            a.setLine(0, "§7§m---------");
            a.setLine(1, Main.getProvidingPlugin(Main.class).getConfig().getString("SIGN.Line2")).replace("&", "§"));
            a.setLine(3, "§7§m---------");
            var2.sendMessage(Main.prefix + "§2" + var3 + "§a is not more in maintenace...");
            a.update();
         }
      }

   }
}
