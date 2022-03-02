package se.gottfrid.abstraction.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import se.gottfrid.abstraction.AbstractionMain;

public class AbstractionBlocks {




    // register
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(AbstractionMain.ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(AbstractionMain.ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        AbstractionMain.LOGGER.info("Registering ModBlocks for " + AbstractionMain.ID);
    }
}
