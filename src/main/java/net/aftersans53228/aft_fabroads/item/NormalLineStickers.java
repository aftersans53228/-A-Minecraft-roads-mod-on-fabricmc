package net.aftersans53228.aft_fabroads.item;

import net.aftersans53228.aft_fabroads.FabroadsMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class NormalLineStickers {
    public static ItemGroup get() {
        return ITEM_GROUP;
    }

    private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("aft_fabroads", "normal_line_stickers"))
            .icon(() -> new ItemStack(FabroadsMod.LineStraight))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(FabroadsMod.LineStraight));
                stacks.add(new ItemStack(FabroadsMod.LineCorner));
                stacks.add(new ItemStack(FabroadsMod.LineTshaped));
                stacks.add(new ItemStack(FabroadsMod.LineCross));
            })
            .build();
}
