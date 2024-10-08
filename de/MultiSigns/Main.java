package de.MultiSigns;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
   public static String prefix = "§8[§6§öMultiSigns§8] ";

   @EventHandler
   public void Info(PlayerCommandPreprocessEvent a) {
      Player var2 = a.getPlayer();
      if (a.getMessage().equalsIgnoreCase("/multisigns")) {
         var2.sendMessage("§cPlease type: ' /MultiSigns info ' for more help...");
         var2.sendMessage("§cRECoded and DEOBF by NZXTER. Support? Ts: Rayzs.De");
         a.setCancelled(true);
      }

   }

   public void onEnable() {
      a.onLoad();
      PluginManager var1 = Bukkit.getPluginManager();
      var1.registerEvents(new Click_LISTENER(), a);
      var1.registerEvents(new Create_LISTENER(), a);
      var1.registerEvents(a, a);
      a.getCommand("multisigns").setExecutor(new Setup_COMMANDS());
   }

   public void onLoad() {
      a.getConfig().options().copyDefaults(true);
      a.saveConfig();
   }

   public void onDisable() {
      super.onDisable();
   }
}
