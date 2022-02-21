/*    */ package de.dulli.main;
/*    */ 
/*    */ import de.waterbukkit.dulli.logs.Logger;
/*    */ import de.waterbukkit.dulli.main.WaterBukkitUtils;
/*    */ import org.bukkit.plugin.PluginDescriptionFile;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Main
/*    */   extends JavaPlugin
/*    */ {
/*    */   public static Main instance;
/*    */   public static final String prefix = "§bScenarios §7[§61.16§7] §7• §7";
/* 19 */   private final PluginDescriptionFile plFile = getDescription();
/*    */ 
/*    */   
/*    */   private WaterBukkitUtils waterBukkitUtils;
/*    */   
/*    */   Logger logger;
/*    */ 
/*    */   
/*    */   public void onEnable() {
/* 28 */     instance = this;
/*    */     
/* 30 */     Logger.LogMessageToConsole(" ");
/* 31 */     Logger.LogMessageToConsole("§bScenarios §7[§61.16§7] §7• §7§7Das Plugin wurde §aerfolgreich geladen");
/* 32 */     Logger.LogMessageToConsole(" ");
/* 33 */     Logger.LogMessageToConsole("§bScenarios §7[§61.16§7] §7• §7§bDev §7• §a" + (String)this.plFile.getAuthors().get(0));
/* 34 */     Logger.LogMessageToConsole("§bScenarios §7[§61.16§7] §7• §7§cVersion §7• §a" + this.plFile.getVersion());
/* 35 */     Logger.LogMessageToConsole(" ");
/*    */     
/* 37 */     registerListener();
/* 38 */     registerCommands();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void registerListener() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void registerCommands() {}
/*    */ 
/*    */ 
/*    */   
/*    */   public static Main getInstance() {
/* 54 */     return instance;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\Scenarios - Test - 0.0.1.jar!\de\dulli\main\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */