package se.gottfrid.abstraction;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.gottfrid.abstraction.blocks.AbstractionBlocks;
import se.gottfrid.abstraction.items.AbstractionItems;

public class AbstractionMain implements ModInitializer {

	public static final String ID = "abstraction";
	public static final String NAME = "Abstraction";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {
		AbstractionItems.registerModItems();
		AbstractionBlocks.registerModBlocks();
	}
}
