package net.aftersans53228.aft_fabroads.item;

import net.aftersans53228.aft_fabroads.FabroadsMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class NormalArrowStickers {
    public static ItemGroup get() {
        return ITEM_GROUP;
    }

    private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("aft_fabroads", "normal_arrow_stickers"))
            .icon(() -> new ItemStack(FabroadsMod.ArrowForward))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(FabroadsMod.ArrowForward));
                stacks.add(new ItemStack(FabroadsMod.ArrowLeft));
                stacks.add(new ItemStack(FabroadsMod.ArrowRight));
                stacks.add(new ItemStack(FabroadsMod.ArrowForwardLeft));
                stacks.add(new ItemStack(FabroadsMod.ArrowForwardRight));
                stacks.add(new ItemStack(FabroadsMod.ArrowLeftRight));
                stacks.add(new ItemStack(FabroadsMod.ArrowBack));
                stacks.add(new ItemStack(FabroadsMod.ArrowBackLeft));
                stacks.add(new ItemStack(FabroadsMod.ArrowBackForward));
                stacks.add(new ItemStack(FabroadsMod.ArrowConfluenceLeft));
                stacks.add(new ItemStack(FabroadsMod.ArrowConfluenceRight));
            })
            .build();
}
