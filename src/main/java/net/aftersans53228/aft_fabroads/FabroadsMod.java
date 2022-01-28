package net.aftersans53228.aft_fabroads;

import net.aftersans53228.aft_fabroads.block.*;
import net.aftersans53228.aft_fabroads.block.arrowblock.ArrowForward;
import net.aftersans53228.aft_fabroads.block.arrowblock.ArrowLeft;
import net.aftersans53228.aft_fabroads.block.arrowblock.ArrowRight;
import net.aftersans53228.aft_fabroads.item.NormalArrowStickers;
import net.aftersans53228.aft_fabroads.item.NormalLineStickers;
import net.aftersans53228.aft_fabroads.item.NormalRoadBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FabroadsMod implements ModInitializer {
	// 此记录器用于将文本写入控制台和日志文件。
	// 使用您的 mod id 作为记录器的名称被认为是最佳实践。
	// 这样一来，很清楚哪个 mod 写了信息、警告和错误。
	public static final Logger LOGGER = LogManager.getLogger("> aft_fabroads <");

	// 如果有半透明纹理，可以将 RenderLayer.getCutout() 替换为 RenderLayer.getTranslucent()。

	//创建普通道路方块
	public static final Block RoadBlock = new RoadBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
	//创建划线贴纸
	public static final Block LineStraight = new LineStraight(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineCorner = new LineCorner(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineTshaped = new LineTshaped(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineCross = new LineCross(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	//创建箭头贴纸
	public static final Block ArrowForward = new ArrowForward(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowLeft = new ArrowLeft(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowRight = new ArrowRight(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	//创建物品组
	public static final ItemGroup NormalRoadBlockGROUP = NormalRoadBlock.get();
	public static final ItemGroup NormalLineStickersGROUP = NormalLineStickers.get();
	public static final ItemGroup NormalArrowStickersGROUP = NormalArrowStickers.get();

	@Override
	public void onInitialize() {
		// 只要 Minecraft 处于 mod-load-ready 状态，此代码就会运行。
		// 但是，有些东西（比如资源）可能仍然未初始化。
		// 谨慎行事。

		LOGGER.info("aft's Fabroads Initializing...");

		//普通方块注册
		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","road_block"),RoadBlock);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","road_block"),new BlockItem(RoadBlock,new Item.Settings().group(NormalRoadBlockGROUP)));
		LOGGER.info("Normal blocks Initialized...");

		//地面划线注册
		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","line_straight"),LineStraight);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","line_straight"),new BlockItem(LineStraight,new Item.Settings().group(NormalLineStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","line_corner"),LineCorner);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","line_corner"),new BlockItem(LineCorner,new Item.Settings().group(NormalLineStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","line_tshaped"),LineTshaped);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","line_tshaped"),new BlockItem(LineTshaped,new Item.Settings().group(NormalLineStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","line_cross"),LineCross);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","line_cross"),new BlockItem(LineCross,new Item.Settings().group(NormalLineStickersGROUP)));

		LOGGER.info("Line blocks Initialized...");

		//地面箭头注册
		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_forward"),ArrowForward);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_forward"),new BlockItem(ArrowForward,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_left"),ArrowLeft);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_left"),new BlockItem(ArrowLeft,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_right"),ArrowRight);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_right"),new BlockItem(ArrowRight,new Item.Settings().group(NormalArrowStickersGROUP)));

		LOGGER.info("Arrow blocks Initialized...");


		LOGGER.info("aft's Fabroads Initialized...");
	}
}
