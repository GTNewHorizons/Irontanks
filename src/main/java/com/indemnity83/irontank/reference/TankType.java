package com.indemnity83.irontank.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Defines a type of tank.
 * 
 * Tank definitions include all variables required to create a tank block. A
 * given tank type can have multiple crafting recipes and multiple primary
 * crafting materials
 * 
 * @author Kyle Klaus
 *
 */
public enum TankType{
    IRON(32, "irontank", Arrays.asList("ingotIron", "ingotRefinedIron"), Arrays.asList("tgtg0gtgt", "gggt4tggg"), 25/3F),
    GOLD(48, "goldtank", Collections.singletonList("ingotGold"), Arrays.asList("tgtg1gtgt", "gggt5tggg"), 25/3F),
    DIAMOND(64, "diamondtank", Collections.singletonList("gemDiamond"), Arrays.asList("gggt2tggg", "gggg5gttt"), 25/3F),
    COPPER(27, "coppertank", Collections.singletonList("ingotCopper"), Collections.singletonList("tgtg0gtgt"), 25/3F),
    SILVER(43, "silvertank", Collections.singletonList("ingotSilver"), Arrays.asList("tgtg4gtgt", "gggt1tggg"), 25/3F),
    OBSIDIAN(64, "obsidiantank", Collections.singletonList("obsidian"), Collections.singletonList("tgtg3gtgt"), 6000000.0F),
    GLASS(0, "", Collections.singletonList("blockGlass"), Collections.singletonList(""), 0f),
	EMERALD(96, "emeraldtank", Collections.singletonList("gemEmerald"), Collections.singletonList("gggt3tggg"), 25/3F);

	/**
	 * fluid capacity of the tank type
	 */
	public final int capacity;

	/**
	 * The internal name of the tank type
	 */
	public final String name;

	/**
	 * List of primary crafting materials that may be used in crafting recipe.
	 * These materials should substitute for 't' in the recipes list.
	 */
	public final ArrayList<String> materials;

	/**
	 * List of crafting recipes for tank type
	 */
	public final ArrayList<String> recipes;

	/**
	 * Blast resistance of the tank type
	 */
	public final float resistance;

	TankType(int capacity, String name, List<String> materials, List<String> recipes, float resistance) {
		this.capacity = capacity;
		this.name = name;
		this.materials = new ArrayList<String>();
		this.recipes = new ArrayList<String>();
		this.resistance = resistance;

		this.materials.addAll(materials);
		this.recipes.addAll(recipes);
	}

}
