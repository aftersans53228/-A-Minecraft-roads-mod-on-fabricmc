package net.aftersans53228.aft_fabroads.block;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.BlockView;

import java.util.List;

public class ManholeCoverConcrete extends Block {
    public ManholeCoverConcrete(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.aft_fabroads.manhole") );
    }
}
