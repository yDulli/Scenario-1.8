/*     */ package de.dulli.listener;
/*     */ 
/*     */ import de.dulli.commands.ScenariosCMD;
/*     */ import de.dulli.main.Main;
/*     */ import de.dulli.util.ItemBuilder;
/*     */ import java.util.Arrays;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.Sound;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.BlockBreakEvent;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ 
/*     */ 
/*     */ public class Timber
/*     */   implements Listener
/*     */ {
/*     */   private static Main pl;
/*     */   public static boolean activated = false;
/*     */   
/*     */   public Timber(Main pl) {
/*  26 */     Timber.pl = pl;
/*  27 */     pl.getServer().getPluginManager().registerEvents(this, (Plugin)pl);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onBlockbreak(BlockBreakEvent e) {
/*  32 */     Player p = e.getPlayer();
/*  33 */     Block b = e.getBlock();
/*     */     
/*  35 */     if (activated)
/*     */     {
/*  37 */       if (p.getItemInHand().getType() == Material.WOOD_AXE || p.getItemInHand().getType() == Material.STONE_AXE || 
/*  38 */         p.getItemInHand().getType() == Material.IRON_AXE || 
/*  39 */         p.getItemInHand().getType() == Material.GOLD_AXE || 
/*  40 */         p.getItemInHand().getType() == Material.DIAMOND_AXE) {
/*  41 */         breakBlock(b);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   static void breakBlock(Block b) {
/*  47 */     if (b.getType() != Material.LOG && b.getType() != Material.LOG_2) {
/*     */       return;
/*     */     }
/*  50 */     b.getWorld().playSound(b.getLocation(), Sound.DIG_WOOD, 20.0F, 1.0F);
/*     */     
/*  52 */     b.breakNaturally();
/*     */     
/*  54 */     breakBlock(b.getLocation().add(0.0D, 1.0D, 0.0D).getBlock());
/*  55 */     breakBlock(b.getLocation().add(1.0D, 0.0D, 0.0D).getBlock());
/*  56 */     breakBlock(b.getLocation().add(0.0D, 0.0D, 1.0D).getBlock());
/*     */     
/*  58 */     breakBlock(b.getLocation().subtract(0.0D, 1.0D, 0.0D).getBlock());
/*  59 */     breakBlock(b.getLocation().subtract(1.0D, 0.0D, 0.0D).getBlock());
/*  60 */     breakBlock(b.getLocation().subtract(0.0D, 0.0D, 1.0D).getBlock());
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onInvClick(InventoryClickEvent e) {
/*  65 */     Player p = (Player)e.getWhoClicked();
/*     */     
/*  67 */     if (e.getCurrentItem() == null) {
/*     */       return;
/*     */     }
/*  70 */     if (e.getInventory().getName().equals("§7• §bScenarios §7[§61.16§7] §7•"))
/*     */     {
/*  72 */       if (!p.isOp()) {
/*  73 */         e.setCancelled(true);
/*     */       } else {
/*     */         
/*  76 */         e.setCancelled(true);
/*     */         
/*  78 */         if (e.getCurrentItem().getType() == Material.WOOD)
/*     */         {
/*  80 */           if (!activated) {
/*     */             
/*  82 */             activated = true;
/*  83 */             Bukkit.broadcastMessage(String.valueOf("§bScenarios §7[§61.16§7] §7• §7") + "§bTimber §7wurde §aaktiviert");
/*     */             
/*  85 */             ScenariosCMD.inv.setItem(12, (
/*  86 */                 new ItemBuilder(Material.WOOD, 1))
/*  87 */                 .setDisplayname("§7• §aTimber §7•").setLore(Arrays.asList(new String[] { " ", 
/*  88 */                       "§7• §bBaut Bäume für dich ab", "§7• §7Status §aaktiviert", " "
/*  89 */                     })).build());
/*     */           }
/*  91 */           else if (activated) {
/*     */             
/*  93 */             activated = false;
/*  94 */             Bukkit.broadcastMessage(String.valueOf("§bScenarios §7[§61.16§7] §7• §7") + "§bTimber §7wurde §cdeaktiviert");
/*     */             
/*  96 */             ScenariosCMD.inv.setItem(12, (
/*  97 */                 new ItemBuilder(Material.WOOD, 1))
/*  98 */                 .setDisplayname("§7• §cTimber §7•").setLore(Arrays.asList(new String[] { " ", 
/*  99 */                       "§7• §bBaut Bäume für dich ab", "§7• §7Status §cdeaktiviert", " "
/* 100 */                     })).build());
/*     */           } 
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\Scenarios - Test - 0.0.1.jar!\de\dulli\listener\Timber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */