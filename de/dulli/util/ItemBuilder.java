/*    */ package de.dulli.util;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.bukkit.DyeColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.enchantments.Enchantment;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ 
/*    */ public class ItemBuilder
/*    */ {
/*    */   private ItemStack itemStack;
/*    */   private ItemMeta itemMeta;
/*    */   
/*    */   public ItemBuilder(Material material) {
/* 17 */     this.itemStack = new ItemStack(material);
/* 18 */     this.itemMeta = this.itemStack.getItemMeta();
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemBuilder(Material material, int stack, DyeColor d) {
/* 23 */     this.itemStack = new ItemStack(material, stack, d.getData());
/* 24 */     this.itemMeta = this.itemStack.getItemMeta();
/*    */   }
/*    */   
/*    */   public ItemBuilder(Material material, int stack) {
/* 28 */     this.itemStack = new ItemStack(material, stack);
/* 29 */     this.itemMeta = this.itemStack.getItemMeta();
/*    */   }
/*    */   
/*    */   public ItemBuilder setDisplayname(String arg0) {
/* 33 */     this.itemMeta.setDisplayName(arg0);
/* 34 */     return this;
/*    */   }
/*    */   
/*    */   public ItemBuilder addEnchantment(Enchantment e, Integer strenght, boolean b) {
/* 38 */     this.itemMeta.addEnchant(e, strenght.intValue(), b);
/* 39 */     return this;
/*    */   }
/*    */   
/*    */   public ItemBuilder setLore(List<String> list) {
/* 43 */     this.itemMeta.setLore(list);
/* 44 */     return this;
/*    */   }
/*    */   
/*    */   public ItemStack build() {
/* 48 */     this.itemStack.setItemMeta(this.itemMeta);
/* 49 */     return this.itemStack;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\Scenarios - Test - 0.0.1.jar!\de\dull\\util\ItemBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */