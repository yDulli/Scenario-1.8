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
/*     */ import org.bukkit.entity.ExperienceOrb;
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
/*     */ public class CutClean
/*     */   implements Listener
/*     */ {
/*     */   private static Main pl;
/*     */   public static boolean activated = false;
/*     */   
/*     */   public CutClean(Main pl) {
/*  29 */     CutClean.pl = pl;
/*  30 */     pl.getServer().getPluginManager().registerEvents(this, (Plugin)pl);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onBlockBreak(BlockBreakEvent e) {
/*  35 */     Player p = e.getPlayer();
/*  36 */     Block b = e.getBlock();
/*  37 */     Location clone = new Location(b.getWorld(), b.getLocation().getBlockX() + 0.5D, b.getLocation().getBlockY(), 
/*  38 */         b.getLocation().getBlockZ() + 0.5D);
/*     */     
/*  40 */     if (activated) {
/*  41 */       if (!DoubleOres.activated) {
/*  42 */         if (b.getType() == Material.IRON_ORE)
/*     */         {
/*  44 */           b.setType(Material.AIR);
/*  45 */           b.getState().update();
/*  46 */           b.getWorld().dropItemNaturally(clone, new ItemStack(Material.IRON_INGOT));
/*  47 */           ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */         }
/*  49 */         else if (b.getType() == Material.GOLD_ORE)
/*     */         {
/*  51 */           b.setType(Material.AIR);
/*  52 */           b.getState().update();
/*  53 */           b.getWorld().dropItemNaturally(clone, new ItemStack(Material.GOLD_INGOT));
/*  54 */           ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */         }
/*  56 */         else if (b.getType() == Material.REDSTONE_ORE)
/*     */         {
/*  58 */           b.setType(Material.AIR);
/*  59 */           b.getState().update();
/*  60 */           b.getWorld().dropItemNaturally(clone, new ItemStack(Material.REDSTONE));
/*  61 */           ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */         }
/*  63 */         else if (b.getType() == Material.EMERALD_ORE)
/*     */         {
/*  65 */           b.setType(Material.AIR);
/*  66 */           b.getState().update();
/*  67 */           b.getWorld().dropItemNaturally(clone, new ItemStack(Material.EMERALD));
/*  68 */           ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */         }
/*  70 */         else if (b.getType() == Material.DIAMOND_ORE)
/*     */         {
/*  72 */           b.setType(Material.AIR);
/*  73 */           b.getState().update();
/*  74 */           b.getWorld().dropItemNaturally(clone, new ItemStack(Material.DIAMOND));
/*  75 */           ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*  81 */       else if (b.getType() == Material.IRON_ORE) {
/*     */         
/*  83 */         b.setType(Material.AIR);
/*  84 */         b.getState().update();
/*  85 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.IRON_INGOT, 2));
/*  86 */         ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */       }
/*  88 */       else if (b.getType() == Material.GOLD_ORE) {
/*     */         
/*  90 */         b.setType(Material.AIR);
/*  91 */         b.getState().update();
/*  92 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.GOLD_INGOT, 2));
/*  93 */         ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */       }
/*  95 */       else if (b.getType() == Material.LAPIS_ORE) {
/*     */         
/*  97 */         b.setType(Material.AIR);
/*  98 */         b.getState().update();
/*  99 */         ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */       }
/* 101 */       else if (b.getType() == Material.REDSTONE_ORE) {
/*     */         
/* 103 */         b.setType(Material.AIR);
/* 104 */         b.getState().update();
/* 105 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.REDSTONE, 2));
/* 106 */         ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */       }
/* 108 */       else if (b.getType() == Material.EMERALD_ORE) {
/*     */         
/* 110 */         b.setType(Material.AIR);
/* 111 */         b.getState().update();
/* 112 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.EMERALD, 2));
/* 113 */         ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */       }
/* 115 */       else if (b.getType() == Material.DIAMOND_ORE) {
/*     */         
/* 117 */         b.setType(Material.AIR);
/* 118 */         b.getState().update();
/* 119 */         b.getWorld().dropItemNaturally(clone, new ItemStack(Material.DIAMOND, 2));
/* 120 */         ((ExperienceOrb)b.getWorld().spawn(clone, ExperienceOrb.class)).setExperience(3);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @EventHandler
/*     */   public void onInvClick(InventoryClickEvent e) {
/* 130 */     Player p = (Player)e.getWhoClicked();
/*     */     
/* 132 */     if (e.getCurrentItem() == null) {
/*     */       return;
/*     */     }
/* 135 */     if (e.getInventory().getName().equals("§7• §bScenarios §7[§61.16§7] §7•"))
/*     */     {
/* 137 */       if (!p.isOp()) {
/* 138 */         e.setCancelled(true);
/*     */       } else {
/* 140 */         e.setCancelled(true);
/* 141 */         if (e.getCurrentItem().getType() == Material.IRON_INGOT)
/*     */         {
/* 143 */           if (!activated) {
/*     */             
/* 145 */             activated = true;
/* 146 */             Bukkit.broadcastMessage(String.valueOf("§bScenarios §7[§61.16§7] §7• §7") + "§bCutclean §7wurde §aaktiviert");
/*     */             
/* 148 */             ScenariosCMD.inv
/* 149 */               .setItem(10, (
/* 150 */                 new ItemBuilder(Material.IRON_INGOT)).setDisplayname("§7• §aCutclean §7•")
/* 151 */                 .setLore(Arrays.asList(new String[] { " ", 
/* 152 */                       "§7• §bIngots §7werden aus §bErzen §7direkt gedropt", 
/* 153 */                       "§7• §7Status §aaktiviert", " "
/* 154 */                     })).build());
/*     */           }
/* 156 */           else if (activated) {
/*     */             
/* 158 */             activated = false;
/* 159 */             Bukkit.broadcastMessage(String.valueOf("§bScenarios §7[§61.16§7] §7• §7") + "§bCutclean §7wurde §cdeaktiviert");
/*     */             
/* 161 */             ScenariosCMD.inv
/* 162 */               .setItem(10, (
/* 163 */                 new ItemBuilder(Material.IRON_INGOT)).setDisplayname("§7• §cCutclean §7•")
/* 164 */                 .setLore(Arrays.asList(new String[] { " ", 
/* 165 */                       "§7• §bIngots §7werden aus §bErzen §7direkt gedropt", 
/* 166 */                       "§7• §7Status §cdeaktiviert", " "
/* 167 */                     })).build());
/*     */           } 
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\Scenarios - Test - 0.0.1.jar!\de\dulli\listener\CutClean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */