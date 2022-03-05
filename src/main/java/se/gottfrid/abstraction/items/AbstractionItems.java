package se.gottfrid.abstraction.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import se.gottfrid.abstraction.AbstractionMain;

public class AbstractionItems {

//public static final Item EXAMPLE = registerItem("example",
    //new Item(new FabricItemSettings().group(AbstractionItemGroup.ABSTRACTION)));

// misc

    // craftingc

        // misc
    public static final Item ANDESITE_ALLOY = registerItem("andesite_alloy",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.CRAFTINGC)));

        // fixtures

        // mechanisms


// metal

    // raw
    public static final Item RAW_TIN = registerItem("raw_tin",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item RAW_SILVER = registerItem("raw_silver",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item RAW_LEAD = registerItem("raw_lead",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item RAW_NICKEL = registerItem("raw_nickel",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    public static final Item RAW_ZINC = registerItem("raw_zinc",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    public static final Item RAW_BRASS = registerItem("raw_brass",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

        // ingot
    public static final Item TIN_INGOT = registerItem("tin_ingot",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item LEAD_INGOT = registerItem("lead_ingot",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    public static final Item ZINC_INGOT = registerItem("zinc_ingot",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    public static final Item BRASS_INGOT = registerItem("brass_ingot",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

        // nugget
    public static final Item TIN_NUGGET = registerItem("tin_nugget",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    public static final Item ZINC_NUGGET = registerItem("zinc_nugget",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    public static final Item BRASS_NUGGET = registerItem("brass_nugget",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

        // crushed
    public static final Item CRUSHED_TIN = registerItem("crushed_tin",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item CRUSHED_ALUMINIUM = registerItem("crushed_aluminium",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item CRUSHED_SILVER = registerItem("crushed_silver",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item CRUSHED_LEAD = registerItem("crushed_lead",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item CRUSHED_NICKEL = registerItem("crushed_nickel",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item CRUSHED_PLATINUM = registerItem("crushed_platinum",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    public static final Item CRUSHED_ZINC = registerItem("crushed_zinc",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    public static final Item CRUSHED_BRASS = registerItem("crushed_brass",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

        // pulverized

    public static final Item PULVERIZED_TIN = registerItem("pulverized_tin",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item PULVERIZED_ALUMINIUM = registerItem("pulverized_aluminium",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item PULVERIZED_SILVER = registerItem("pulverized_silver",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item PULVERIZED_LEAD = registerItem("pulverized_lead",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item PULVERIZED_NICKEL = registerItem("pulverized_nickel",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));
    public static final Item PULVERIZED_PLATINUM = registerItem("pulverized_platinum",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    public static final Item PULVERIZED_ZINC = registerItem("pulverized_zinc",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    public static final Item PULVERIZED_BRASS = registerItem("pulverized_brass",
        new Item(new FabricItemSettings().group(AbstractionItemGroup.METAL)));

    // register
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AbstractionMain.ID, name), item);
    }
    public static void registerModItems() {
        AbstractionMain.LOGGER.info("Registering Mod Items for " + AbstractionMain.ID);
    }
}
