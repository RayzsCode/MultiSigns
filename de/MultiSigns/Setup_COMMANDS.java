package de.MultiSigns;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Setup_COMMANDS implements CommandExecutor {
   public boolean onCommand(CommandSender a, Command a2, String a3, String[] a) {
      if (a.hasPermission("MultiSigns.Help")) {
         if (a[0].equalsIgnoreCase("info")) {
            a.sendMessage("§8§l§m-------§6§lMULTISIGNS§8§l§m------");
            a.sendMessage("§8* §6§lPermissions? §8- §e/MultiSigns Perms");
            a.sendMessage("§8* §6§lHow to use? §8- §e/MultiSigns Tutorial");
            a.sendMessage("§7Currently Version: §6") + Main.getProvidingPlugin(Main.class).getDescription().getVersion());
            a.sendMessage("§8§l§m-----------------------");
         }

         if (a[0].equalsIgnoreCase("perms")) {
            a.sendMessage("§8§l§m-------§6§lMULTISIGNS§8§l§m------");
            a.sendMessage("§e/MultiSigns (...) §8- §6MultiSigns.Help");
            a.sendMessage("§eEnter Maintenance §8- §6MultiSigns.Maintenance");
            a.sendMessage("§eCreate a Sign §8- §6MultiSigns.create");
            a.sendMessage("§8§l§m-----------------------");
         }

         if (a[0].equalsIgnoreCase("Tutorial")) {
            a.sendMessage("§8§l§m-------§6§lMULTISIGNS§8§l§m------");
            a.sendMessage("§e1) §7Create a Sign");
            a.sendMessage("§e2) §7First Line: §6[MultiSigns]");
            a.sendMessage("§e3) §7Second Line: §6Your Worldname");
            a.sendMessage("§aAnd now, you have succesfully created a sign!");
            a.sendMessage("§8§l§m---------");
            a.sendMessage("§eWhen you sneak to a sign and left click it, the maintenancemode is activated or deactivated!");
            a.sendMessage("§8§l§m-----------------------");
         }
      }

      return false;
   }
}
