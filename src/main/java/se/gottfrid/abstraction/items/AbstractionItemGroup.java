package se.gottfrid.abstraction.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import se.gottfrid.abstraction.AbstractionMain;

public class AbstractionItemGroup {
    // util
    public static final ItemGroup METAL = FabricItemGroupBuilder.build(new Identifier(AbstractionMain.ID, "metal"),
            () -> new ItemStack(AbstractionItems.PLATINUM_INGOT));
    public static final ItemGroup CRAFTINGC = FabricItemGroupBuilder.build(new Identifier(AbstractionMain.ID, "craftingc"),
            () -> new ItemStack(Items.STICK));

    // useful
    public static final ItemGroup FIXTURES = FabricItemGroupBuilder.build(new Identifier(AbstractionMain.ID, "fixtures"),
            () -> new ItemStack(Blocks.DEAD_BUSH));
    public static final ItemGroup MECHANISMS = FabricItemGroupBuilder.build(new Identifier(AbstractionMain.ID, "mechanisms"),
            () -> new ItemStack(Blocks.DEAD_BUSH));
    public static final ItemGroup MACHINES = FabricItemGroupBuilder.build(new Identifier(AbstractionMain.ID, "machines"),
            () -> new ItemStack(Blocks.COBBLESTONE));
}
