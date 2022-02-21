/*     */ package de.dulli.listener;
/*     */ 
/*     */ import de.dulli.commands.ScenariosCMD;
/*     */ import de.dulli.main.Main;
/*     */ import de.dulli.util.ItemBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Random;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.LeavesDecayEvent;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ 
/*     */ 
/*     */ public class XTraapples
/*     */   implements Listener
/*     */ {
/*     */   private Main pl;
/*     */   public static boolean activated = false;
/*     */   
/*     */   public XTraapples(Main pl) {
/*  28 */     this.pl = pl;
/*     */     
/*  30 */     pl.getServer().getPluginManager().registerEvents(this, (Plugin)pl);
/*     */   }
/*     */ 
/*     */   
/*     */   @EventHandler
/*     */   public void test(LeavesDecayEvent e) {
/*  36 */     final Block b = e.getBlock();
/*     */     
/*  38 */     if (activated) {
/*     */       
/*  40 */       e.setCancelled(true);
/*     */       
/*  42 */       final Location clone = new Location(b.getWorld(), b.getLocation().getBlockX() + 0.5D, b.getLocation().getBlockY(), 
/*  43 */           b.getLocation().getBlockZ() + 0.5D);
/*     */       
/*  45 */       Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)this.pl, new Runnable() {
/*     */             public void run() {
/*  47 */               b.setType(Material.AIR);
/*  48 */               b.getState().update();
/*     */               
/*  50 */               Random rand = new Random();
/*  51 */               int number = rand.nextInt(10);
/*     */               
/*  53 */               if (number == 10) {
/*  54 */                 b.getWorld().dropItemNaturally(clone, new ItemStack(Material.APPLE));
/*     */               }
/*     */               
/*  57 */               if (number == 3) {
/*  58 */                 b.getWorld().dropItemNaturally(clone, new ItemStack(Material.SAPLING));
/*     */               }
/*     */             }
/*  61 */           }40L);
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onInvClick(InventoryClickEvent e) {
/*  67 */     Player p = (Player)e.getWhoClicked();
/*     */     
/*  69 */     if (e.getCurrentItem() == null) {
/*     */       return;
/*     */     }
/*  72 */     if (e.getInventory().getName().equals("§7• §bScenarios §7[§61.16§7] §7•"))
/*     */     {
/*  74 */       if (!p.isOp()) {
/*  75 */         e.setCancelled(true);
/*     */       } else {
/*     */         
/*  78 */         e.setCancelled(true);
/*  79 */         if (e.getCurrentItem().getType() == Material.APPLE)
/*     */         {
/*  81 */           if (!activated) {
/*     */             
/*  83 */             activated = true;
/*  84 */             Bukkit.broadcastMessage(String.valueOf("§bScenarios §7[§61.16§7] §7• §7") + "§bXTraApples §7wurde §aaktiviert");
/*     */             
/*  86 */             ScenariosCMD.inv.setItem(13, (
/*  87 */                 new ItemBuilder(Material.APPLE, 1)).setDisplayname("§7• §aXTraApples §7•")
/*  88 */                 .setLore(Arrays.asList(new String[] { " ", 
/*  89 */                       "§7• §bEine höhere % Chance das man Äpfel bei leaves bekommt", 
/*  90 */                       "§7• §7Status §aaktiviert", " "
/*  91 */                     })).build());
/*  92 */             p.updateInventory();
/*     */           }
/*  94 */           else if (activated) {
/*     */             
/*  96 */             activated = false;
/*  97 */             Bukkit.broadcastMessage(String.valueOf("§bScenarios §7[§61.16§7] §7• §7") + "§bXTraApples §7wurde §cdeaktiviert");
/*     */             
/*  99 */             ScenariosCMD.inv.setItem(13, (
/* 100 */                 new ItemBuilder(Material.APPLE, 1)).setDisplayname("§7• §cXTraApples §7•")
/* 101 */                 .setLore(Arrays.asList(new String[] { " ", 
/* 102 */                       "§7• §bEine höhere % Chance das man Äpfel bei leaves bekommt", 
/* 103 */                       "§7• §7Status §cdeaktiviert", " "
/* 104 */                     })).build());
/* 105 */             p.updateInventory();
/*     */           } 
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\Scenarios - Test - 0.0.1.jar!\de\dulli\listener\XTraapples.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */