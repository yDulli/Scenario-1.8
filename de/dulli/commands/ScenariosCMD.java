/*     */ package de.dulli.commands;
/*     */ 
/*     */ import de.dulli.listener.CutClean;
/*     */ import de.dulli.listener.DoubleOres;
/*     */ import de.dulli.listener.Timber;
/*     */ import de.dulli.listener.XTraapples;
/*     */ import de.dulli.listener.XTraapples_Special;
/*     */ import de.dulli.main.Main;
/*     */ import de.dulli.util.ItemBuilder;
/*     */ import java.util.Arrays;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.DyeColor;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.Sound;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScenariosCMD
/*     */   implements CommandExecutor
/*     */ {
/*     */   private static Main pl;
/*  27 */   public static Inventory inv = Bukkit.createInventory(null, 27, "§7• §bScenarios §7[§61.16§7] §7•");
/*     */   
/*     */   public ScenariosCMD(Main pl) {
/*  30 */     ScenariosCMD.pl = pl;
/*  31 */     pl.getCommand("scenarios").setExecutor(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onCommand(CommandSender s, Command c, String l, String[] args) {
/*  36 */     if (s instanceof Player) {
/*     */       
/*  38 */       Player p = (Player)s;
/*     */       
/*  40 */       if (args.length == 0) {
/*     */ 
/*     */         
/*  43 */         if (CutClean.activated) {
/*  44 */           inv.setItem(10, (
/*  45 */               new ItemBuilder(Material.IRON_INGOT)).setDisplayname("§7• §aCutclean §7•")
/*  46 */               .setLore(
/*  47 */                 Arrays.asList(new String[] { " ", "§7• §bIngots §7werden aus §bErzen §7direkt gedropt", 
/*  48 */                     "§7• §7Status §aaktiviert", " "
/*  49 */                   })).build());
/*     */         } else {
/*  51 */           inv.setItem(10, (
/*  52 */               new ItemBuilder(Material.IRON_INGOT)).setDisplayname("§7• §cCutclean §7•")
/*  53 */               .setLore(
/*  54 */                 Arrays.asList(new String[] { " ", "§7• §bIngots §7werden aus §bErzen §7direkt gedropt", 
/*  55 */                     "§7• §7Status §cdeaktiviert", " "
/*  56 */                   })).build());
/*     */         } 
/*     */         
/*  59 */         if (DoubleOres.activated) {
/*  60 */           inv.setItem(11, (
/*  61 */               new ItemBuilder(Material.GOLD_INGOT, 2)).setDisplayname("§7• §aDouble Ores §7•")
/*  62 */               .setLore(
/*  63 */                 Arrays.asList(new String[] { " ", "§7• §bDu bekommst doppelt so viele Ingots", 
/*  64 */                     "§7• §7Status §aaktiviert", " "
/*  65 */                   })).build());
/*     */         } else {
/*  67 */           inv.setItem(11, (
/*  68 */               new ItemBuilder(Material.GOLD_INGOT, 2)).setDisplayname("§7• §cDouble Ores §7•")
/*  69 */               .setLore(
/*  70 */                 Arrays.asList(new String[] { " ", "§7• §bDu bekommst doppelt so viele Ingots", 
/*  71 */                     "§7• §7Status §cdeaktiviert", " "
/*  72 */                   })).build());
/*     */         } 
/*     */         
/*  75 */         if (Timber.activated) {
/*  76 */           inv.setItem(12, (
/*  77 */               new ItemBuilder(Material.WOOD, 1)).setDisplayname("§7• §aTimber §7•")
/*  78 */               .setLore(
/*  79 */                 Arrays.asList(new String[] { " ", "§7• §bBaut Bäume für dich ab", 
/*  80 */                     "§7• §7Status §aaktiviert", " "
/*  81 */                   })).build());
/*     */         } else {
/*  83 */           inv.setItem(12, (
/*  84 */               new ItemBuilder(Material.WOOD, 1)).setDisplayname("§7• §cTimber §7•")
/*  85 */               .setLore(
/*  86 */                 Arrays.asList(new String[] { " ", "§7• §bBaut Bäume für dich ab", 
/*  87 */                     "§7• §7Status §cdeaktiviert", " "
/*  88 */                   })).build());
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/*  93 */         if (XTraapples.activated) {
/*  94 */           inv.setItem(13, (
/*  95 */               new ItemBuilder(Material.APPLE, 1)).setDisplayname("§7• §aXTraApples §7•")
/*  96 */               .setLore(
/*  97 */                 Arrays.asList(new String[] { " ", "§7• §bEine höhere % Chance das man Äpfel bei leaves bekommt", 
/*  98 */                     "§7• §7Status §aaktiviert", " "
/*  99 */                   })).build());
/*     */         } else {
/* 101 */           inv.setItem(13, (
/* 102 */               new ItemBuilder(Material.APPLE, 1)).setDisplayname("§7• §cXTraApples §7•")
/* 103 */               .setLore(
/* 104 */                 Arrays.asList(new String[] { " ", "§7• §bEine höhere % Chance das man Äpfel bei leaves bekommt", 
/* 105 */                     "§7• §7Status §cdeaktiviert", " "
/* 106 */                   })).build());
/*     */         } 
/*     */         
/* 109 */         if (XTraapples_Special.activated) {
/* 110 */           inv.setItem(14, (
/* 111 */               new ItemBuilder(Material.GOLDEN_APPLE, 1)).setDisplayname("§7• §aXTraApples Special §7•")
/* 112 */               .setLore(
/* 113 */                 Arrays.asList(new String[] { " ", "§7• §bEine Chance auf Goldene Äpfel in leaves", 
/* 114 */                     "§7• §7Status §aaktiviert", " "
/* 115 */                   })).build());
/*     */         } else {
/* 117 */           inv.setItem(14, (
/* 118 */               new ItemBuilder(Material.GOLDEN_APPLE, 1)).setDisplayname("§7• §cXTraApples Special §7•")
/* 119 */               .setLore(
/* 120 */                 Arrays.asList(new String[] { " ", "§7• §bEine Chance auf Goldene Äpfel in leaves", 
/* 121 */                     "§7• §7Status §cdeaktiviert", " "
/* 122 */                   })).build());
/*     */         } 
/*     */         
/* 125 */         FillInv(inv);
/* 126 */         p.playSound(p.getLocation(), Sound.LEVEL_UP, 5.0F, 0.0F);
/* 127 */         p.openInventory(inv);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 132 */     return false;
/*     */   }
/*     */   
/*     */   private void FillInv(Inventory in) {
/* 136 */     in.setItem(0, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 137 */     in.setItem(1, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 138 */     in.setItem(2, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 139 */     in.setItem(3, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 140 */     in.setItem(4, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 141 */     in.setItem(5, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 142 */     in.setItem(6, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 143 */     in.setItem(7, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 144 */     in.setItem(8, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 145 */     in.setItem(9, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 146 */     in.setItem(17, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 147 */     in.setItem(18, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 148 */     in.setItem(19, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 149 */     in.setItem(20, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 150 */     in.setItem(21, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 151 */     in.setItem(22, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 152 */     in.setItem(23, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 153 */     in.setItem(24, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 154 */     in.setItem(25, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/* 155 */     in.setItem(26, (new ItemBuilder(Material.STAINED_GLASS_PANE, 1, DyeColor.BLUE)).setDisplayname(" ").build());
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\Scenarios - Test - 0.0.1.jar!\de\dulli\commands\ScenariosCMD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */