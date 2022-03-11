package net.aftersans53228.aft_fabroads.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class RoadTool extends Item {
    public RoadTool(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        // 默认为白色文本
        tooltip.add( new TranslatableText(" ") );
        tooltip.add( new TranslatableText("item.aft_fabroads.road_tool.tip1") );
        tooltip.add( new TranslatableText("item.aft_fabroads.road_tool.tip2") );
        tooltip.add( new TranslatableText("item.aft_fabroads.road_tool.tip3") );
        tooltip.add( new TranslatableText(" ") );
        tooltip.add( new TranslatableText("item.aft_fabroads.road_tool.tip4") );
    }
}
