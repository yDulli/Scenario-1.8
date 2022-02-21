/*    */ package de.dulli.listener;
/*    */ 
/*    */ import de.dulli.commands.ScenariosCMD;
/*    */ import de.dulli.main.Main;
/*    */ import de.dulli.util.ItemBuilder;
/*    */ import java.util.Arrays;
/*    */ import java.util.Random;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.LeavesDecayEvent;
/*    */ import org.bukkit.event.inventory.InventoryClickEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ 
/*    */ public class XTraapples_Special
/*    */   implements Listener
/*    */ {
/*    */   private Main pl;
/*    */   public static boolean activated = false;
/*    */   
/*    */   public XTraapples_Special(Main pl) {
/* 28 */     this.pl = pl;
/*    */     
/* 30 */     pl.getServer().getPluginManager().registerEvents(this, (Plugin)pl);
/*    */   }
/*    */ 
/*    */   
/*    */   @EventHandler
/*    */   public void test(LeavesDecayEvent e) {
/* 36 */     final Block b = e.getBlock();
/*    */     
/* 38 */     if (activated) {
/*    */       
/* 40 */       e.setCancelled(true);
/*    */       
/* 42 */       final Location clone = new Location(b.getWorld(), b.getLocation().getBlockX() + 0.5D, b.getLocation().getBlockY(), 
/* 43 */           b.getLocation().getBlockZ() + 0.5D);
/*    */       
/* 45 */       Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)this.pl, new Runnable() {
/*    */             public void run() {
/* 47 */               b.setType(Material.AIR);
/* 48 */               b.getState().update();
/*    */               
/* 50 */               Random rand = new Random();
/* 51 */               int number = rand.nextInt(20);
/*    */               
/* 53 */               if (number == 1) {
/* 54 */                 b.getWorld().dropItemNaturally(clone, new ItemStack(Material.GOLDEN_APPLE));
/*    */               }
/*    */             }
/* 57 */           }20L);
/*    */     } 
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onInvClick(InventoryClickEvent e) {
/* 63 */     Player p = (Player)e.getWhoClicked();
/*    */     
/* 65 */     if (e.getCurrentItem() == null) {
/*    */       return;
/*    */     }
/* 68 */     if (e.getInventory().getName().equals("§7• §bScenarios §7[§61.16§7] §7•"))
/*    */     {
/* 70 */       if (!p.isOp()) {
/* 71 */         e.setCancelled(true);
/*    */       } else {
/* 73 */         e.setCancelled(true);
/* 74 */         if (e.getCurrentItem().getType() == Material.GOLDEN_APPLE)
/*    */         {
/* 76 */           if (!activated) {
/*    */             
/* 78 */             activated = true;
/* 79 */             Bukkit.broadcastMessage(String.valueOf("§bScenarios §7[§61.16§7] §7• §7") + "§bXTraApples Special §7wurde §aaktiviert");
/*    */             
/* 81 */             ScenariosCMD.inv.setItem(14, (
/* 82 */                 new ItemBuilder(Material.GOLDEN_APPLE, 1)).setDisplayname("§7• §aXTraApples Special §7•")
/* 83 */                 .setLore(Arrays.asList(new String[] { " ", "§7• §bEine Chance auf Goldene Äpfel in leaves", 
/* 84 */                       "§7• §7Status §aaktiviert", " "
/* 85 */                     })).build());
/* 86 */             p.updateInventory();
/*    */           }
/* 88 */           else if (activated) {
/*    */             
/* 90 */             activated = false;
/* 91 */             Bukkit.broadcastMessage(String.valueOf("§bScenarios §7[§61.16§7] §7• §7") + "§bXTraApples Special §7wurde §cdeaktiviert");
/*    */             
/* 93 */             ScenariosCMD.inv.setItem(14, (
/* 94 */                 new ItemBuilder(Material.GOLDEN_APPLE, 1)).setDisplayname("§7• §cXTraApples Special §7•")
/* 95 */                 .setLore(Arrays.asList(new String[] { " ", "§7• §bEine Chance auf Goldene Äpfel in leaves", 
/* 96 */                       "§7• §7Status §cdeaktiviert", " "
/* 97 */                     })).build());
/* 98 */             p.updateInventory();
/*    */           } 
/*    */         }
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\Scenarios - Test - 0.0.1.jar!\de\dulli\listener\XTraapples_Special.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */