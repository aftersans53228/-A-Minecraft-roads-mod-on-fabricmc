package net.aftersans53228.aft_fabroads.item;

import net.aftersans53228.aft_fabroads.FabroadsMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RoadDecoration {
    public static ItemGroup get() {
        return ITEM_GROUP;
    }

    private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("aft_fabroads", "road_decoration"))
            .icon(() -> new ItemStack(FabroadsMod.Railings))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(FabroadsMod.Railings));
                stacks.add(new ItemStack(FabroadsMod.ExpresswayRailings));
            })
            .build();
}

