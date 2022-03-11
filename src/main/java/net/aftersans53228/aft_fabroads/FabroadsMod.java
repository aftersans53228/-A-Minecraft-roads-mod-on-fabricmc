package net.aftersans53228.aft_fabroads;

import net.aftersans53228.aft_fabroads.block.*;
import net.aftersans53228.aft_fabroads.block.arrowblock.*;
import net.aftersans53228.aft_fabroads.item.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
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

	//创建物品
	public static final Item RoadTool = new RoadTool(new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1));
	//创建普通道路方块
	public static final Block RoadBlock = new RoadBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
	public static final Block RoadBlockConcrete = new RoadBlockConcrete(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
	public static final Block ManholeCover = new ManholeCover(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
	public static final Block ManholeCoverConcrete = new ManholeCoverConcrete(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
	//创建划线贴纸
	public static final Block LineStraight = new LineStraight(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineCorner = new LineCorner(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineTshaped = new LineTshaped(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineCross = new LineCross(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineDiagonal = new LineDiagonal(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineLeftBend = new LineLeftBend(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineRightBend = new LineRightBend(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineForkLeft = new LineForkLeft(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block LineForkRight = new LineForkRight(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	//创建箭头贴纸
	public static final Block ArrowForward = new ArrowForward(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowLeft = new ArrowLeft(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowRight = new ArrowRight(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowForwardLeft = new ArrowForwardLeft(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowForwardRight = new ArrowForwardRight(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowBack = new ArrowBack(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowLeftRight = new ArrowLeftRight(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowBackLeft = new ArrowBackLeft(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowBackForward = new ArrowBackForward(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowConfluenceLeft = new ArrowConfluenceLeft(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	public static final Block ArrowConfluenceRight = new ArrowConfluenceRight(FabricBlockSettings.of(Material.STONE).hardness(0.1f).nonOpaque());
	//创建装饰方块
	public static final Block Railings = new Railings(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
	public static final Block ExpresswayRailings = new ExpresswayRailings(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
	//创建物品组
	public static final ItemGroup NormalRoadBlockGROUP = NormalRoadBlock.get();
	public static final ItemGroup NormalLineStickersGROUP = NormalLineStickers.get();
	public static final ItemGroup NormalArrowStickersGROUP = NormalArrowStickers.get();
	public static final ItemGroup RoadDecorationsGROUP = RoadDecoration.get();


	@Override
	public void onInitialize() {
		// 只要 Minecraft 处于 mod-load-ready 状态，此代码就会运行。
		// 但是，有些东西（比如资源）可能仍然未初始化。
		// 谨慎行事。

		LOGGER.info("aft's Fabroads Initializing...");

		//物品注册
		Registry.register(Registry.ITEM, new Identifier("aft_fabroads", "road_tool"),RoadTool);
		LOGGER.info("Item Initialized...");

		//普通方块注册
		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","road_block"),RoadBlock);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","road_block"),new BlockItem(RoadBlock,new Item.Settings().group(NormalRoadBlockGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","road_block_concrete"),RoadBlockConcrete);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","road_block_concrete"),new BlockItem(RoadBlockConcrete,new Item.Settings().group(NormalRoadBlockGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","manhole_cover"),ManholeCover);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","manhole_cover"),new BlockItem(ManholeCover,new Item.Settings().group(NormalRoadBlockGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","manhole_cover_concrete"),ManholeCoverConcrete);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","manhole_cover_concrete"),new BlockItem(ManholeCoverConcrete,new Item.Settings().group(NormalRoadBlockGROUP)));

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

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","line_diagonal"),LineDiagonal);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","line_diagonal"),new BlockItem(LineDiagonal,new Item.Settings().group(NormalLineStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","line_left_bend"),LineLeftBend);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","line_left_bend"),new BlockItem(LineLeftBend,new Item.Settings().group(NormalLineStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","line_right_bend"),LineRightBend);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","line_right_bend"),new BlockItem(LineRightBend,new Item.Settings().group(NormalLineStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","line_fork_left"),LineForkLeft);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","line_fork_left"),new BlockItem(LineForkLeft,new Item.Settings().group(NormalLineStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","line_fork_right"),LineForkRight);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","line_fork_right"),new BlockItem(LineForkRight,new Item.Settings().group(NormalLineStickersGROUP)));

		LOGGER.info("Line blocks Initialized...");

		//地面箭头注册
		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_forward"),ArrowForward);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_forward"),new BlockItem(ArrowForward,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_left"),ArrowLeft);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_left"),new BlockItem(ArrowLeft,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_right"),ArrowRight);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_right"),new BlockItem(ArrowRight,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_forward_left"),ArrowForwardLeft);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_forward_left"),new BlockItem(ArrowForwardLeft,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_forward_right"),ArrowForwardRight);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_forward_right"),new BlockItem(ArrowForwardRight,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_back"),ArrowBack);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_back"),new BlockItem(ArrowBack,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_left_right"), ArrowLeftRight);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_left_right"),new BlockItem(ArrowLeftRight,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_back_left"), ArrowBackLeft);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_back_left"),new BlockItem(ArrowBackLeft,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_back_forward"), ArrowBackForward);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_back_forward"),new BlockItem(ArrowBackForward,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_confluence_left"), ArrowConfluenceLeft);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_confluence_left"),new BlockItem(ArrowConfluenceLeft,new Item.Settings().group(NormalArrowStickersGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","arrow_confluence_right"), ArrowConfluenceRight);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","arrow_confluence_right"),new BlockItem(ArrowConfluenceRight,new Item.Settings().group(NormalArrowStickersGROUP)));
		LOGGER.info("Arrow blocks Initialized...");

		//道路装饰注册
		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","railings"), Railings);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","railings"),new BlockItem(Railings,new Item.Settings().group(RoadDecorationsGROUP)));

		Registry.register(Registry.BLOCK,new Identifier("aft_fabroads","expressway_railings"), ExpresswayRailings);
		Registry.register(Registry.ITEM,new Identifier("aft_fabroads","expressway_railings"),new BlockItem(ExpresswayRailings,new Item.Settings().group(RoadDecorationsGROUP)));


		LOGGER.info("aft's Fabroads Initialized...");

	}
}
