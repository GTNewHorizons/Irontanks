package com.indemnity83.irontank.reference;

import static com.indemnity83.irontank.reference.TankType.*;

/**
 * Defines a type of upgrade item.
 * 
 * An upgrade item can change a tank of a fixed type (source) into another fixed
 * type (target)
 * 
 * @author Kyle Klaus
 *
 */
public enum TankChangerType {
	IRONGOLD(IRON, GOLD, "ironGoldUpgrade", "2g2", "zez", "rgv"),
	GOLDDIAMOND(GOLD, DIAMOND, "goldDiamondUpgrade", "5d5", "zhz", "rdv"),
	SILVERDIAMOND(SILVER, DIAMOND, "silverDiamondUpgrade", "5d5", "zpz", "rdv"),
	COPPERSILVER(COPPER, SILVER, "copperSilverUpgrade", "4s4", "zqz", "rsv"),
	SILVERGOLD(SILVER, GOLD, "silverGoldUpgrade", "2g2", "zpz", "rgv"),
	COPPERIRON(COPPER, IRON, "copperIronUpgrade", "1i1", "zqz", "riv"),
	GLASSIRON(GLASS, IRON, "glassIronUpgrade", "1i1", "zjz", "riv"),
	GLASSCOPPER(GLASS, COPPER, "glassCopperUpgrade", "3c3", "zjz", "rcv"),
	DIAMONDOBSIDIAN(DIAMOND, OBSIDIAN, "diamondObsidianUpgrade", "5o5", "zdz", "rov"),
	DIAMONDEMERALD(DIAMOND, EMERALD, "diamondEmeraldUpgrade", "6a6", "zdz", "rav"),
	EMERALDSTAINLESSSTEEL(EMERALD, STAINLESSSTEEL, "emeraldStainlesssteelUpgrade", "8b8", "zfz", "rbv"),
	STAINLESSSTEELTITANIUM(STAINLESSSTEEL, TITANIUM, "stainlesssteelTitaniumUpgrade", "9t9", "zlz", "rtv"),
	TITANIUMTUNGSTENSTEEL(TITANIUM, TUNGSTENSTEEL, "titaniumTungstensteelUpgrade", "0u0", "zkz", "ruv");

	/**
	 * IronTankType that this changer will work on
	 */
	public final TankType source;

	/**
	 * IronTankType that tank should be changed to on activation
	 */
	public final TankType target;

	/**
	 * The internal name of the changer type
	 */
	public final String name;

	/**
	 * A string array of the recipe for this changer type
	 */
	public final String[] recipe;

	/**
	 * Checks if this upgrade type can perform an upgrade on the given
	 * IronTankType
	 * 
	 * @param from type to be checked
	 * @return true if upgrade is allowed
	 */
	public boolean canUpgrade(TankType from) {
		return from != this.source;
	}

	TankChangerType(TankType source, TankType target, String itemName, String... recipe) {
		this.source = source;
		this.target = target;
		this.name = itemName;
		this.recipe = recipe;
	}

}
