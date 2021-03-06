package net.minecraft.item;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemAxe extends ItemTool {
   private static final Set<Block> field_150917_c = Sets.newHashSet(new Block[]{Blocks.field_150344_f, Blocks.field_150342_X, Blocks.field_150364_r, Blocks.field_150363_s, Blocks.field_150486_ae, Blocks.field_150423_aK, Blocks.field_150428_aP, Blocks.field_150440_ba, Blocks.field_150468_ap, Blocks.field_150471_bO, Blocks.field_150452_aw});
   private static final float[] field_185066_m = new float[]{6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
   private static final float[] field_185067_n = new float[]{-3.2F, -3.2F, -3.1F, -3.0F, -3.0F};

   protected ItemAxe(Item.ToolMaterial p_i45327_1_) {
      super(p_i45327_1_, field_150917_c);
      this.field_77865_bY = field_185066_m[p_i45327_1_.ordinal()];
      this.field_185065_c = field_185067_n[p_i45327_1_.ordinal()];
   }

   public float func_150893_a(ItemStack p_150893_1_, IBlockState p_150893_2_) {
      Material material = p_150893_2_.func_185904_a();
      return material != Material.field_151575_d && material != Material.field_151585_k && material != Material.field_151582_l?super.func_150893_a(p_150893_1_, p_150893_2_):this.field_77864_a;
   }
}
