/*     */ package de.dulli.listener;
/*     */ 
/*     */ import de.dulli.commands.ScenariosCMD;
/*     */ import de.dulli.main.Main;
/*     */ import de.dulli.util.ItemBuilder;
/*     */ import java.util.Arrays;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.BlockBreakEvent;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DoubleOres
/*     */   implements Listener
/*     */ {
/*     */   private static Main pl;
/*     */   public static boolean activated = false;
/*     */   
/*     */   public DoubleOres(Main pl) {
/*  29 */     DoubleOres.pl = pl;
/*  30 */     pl.getServer().getPluginManager().registerEvents(this, (Plugin)pl);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onBlockbreak(BlockBreakEvent e) {
/*  35 */     Player p = e.getPlayer();
/*  36 */     Block b = e.getBlock();
/*     */     
/*  38 */     Location clone = new Location(b.getWorld(), b.getLocation().getBlockX() + 0.5D, b.getLocation().getBlockY(), 
/*  39 */         b.getLocation().getBlockZ() + 0.5D);
/*     */     
/*  41 */     if (activated) {
/*  42 */       if (b.getType() == Material.IRON_ORE) {
/*     */         
/*  44 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.IRON_ORE, 1));
/*     */       }
/*  46 */       else if (b.getType() == Material.GOLD_ORE) {
/*     */         
/*  48 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.GOLD_ORE, 1));
/*     */       }
/*  50 */       else if (b.getType() == Material.LAPIS_ORE) {
/*     */         
/*  52 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.INK_SACK, 1, (short)4));
/*     */       }
/*  54 */       else if (b.getType() == Material.REDSTONE_ORE) {
/*     */         
/*  56 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.REDSTONE, 1));
/*     */       }
/*  58 */       else if (b.getType() == Material.EMERALD_ORE) {
/*     */         
/*  60 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.EMERALD, 1));
/*     */       }
/*  62 */       else if (b.getType() == Material.DIAMOND_ORE) {
/*     */         
/*  64 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.DIAMOND, 1));
/*     */       }
/*  66 */       else if (b.getType() == Material.COAL_ORE) {
/*     */         
/*  68 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.COAL, 1));
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @EventHandler
/*     */   public void onInvClick(InventoryClickEvent e) {
/*  77 */     Player p = (Player)e.getWhoClicked();
/*     */     
/*  79 */     if (e.getCurrentItem() == null) {
/*     */       return;
/*     */     }
/*  82 */     if (e.getInventory().getName().equals("§7• §bScenarios §7[§61.16§7] §7•"))
/*     */     {
/*  84 */       if (!p.isOp()) {
/*  85 */         e.setCancelled(true);
/*     */       } else {
/*  87 */         e.setCancelled(true);
/*  88 */         if (e.getCurrentItem().getType() == Material.GOLD_INGOT)
/*     */         {
/*  90 */           if (!activated) {
/*     */             
/*  92 */             activated = true;
/*  93 */             Bukkit.broadcastMessage(String.valueOf("§bScenarios §7[§61.16§7] §7• §7") + "§bDouble Ores §7wurde §aaktiviert");
/*     */             
/*  95 */             ScenariosCMD.inv.setItem(11, (new ItemBuilder(Material.GOLD_INGOT, 2))
/*  96 */                 .setDisplayname("§7• §cDouble Ores §7•").setLore(Arrays.asList(new String[] { " ", 
/*  97 */                       "§7• §bDu bekommst doppelt so viele Ingots", "§7• §7Status §aaktiviert", " "
/*  98 */                     })).build());
/*     */           }
/* 100 */           else if (activated) {
/*     */             
/* 102 */             activated = false;
/* 103 */             Bukkit.broadcastMessage(String.valueOf("§bScenarios §7[§61.16§7] §7• §7") + "§bDouble Ores §7wurde §cdeaktiviert");
/*     */             
/* 105 */             ScenariosCMD.inv.setItem(11, (new ItemBuilder(Material.GOLD_INGOT, 2))
/* 106 */                 .setDisplayname("§7• §cDouble Ores §7•").setLore(Arrays.asList(new String[] { " ", 
/* 107 */                       "§7• §bDu bekommst doppelt so viele Ingots", "§7• §7Status §cdeaktiviert", " "
/* 108 */                     })).build());
/*     */           } 
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\Scenarios - Test - 0.0.1.jar!\de\dulli\listener\DoubleOres.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */