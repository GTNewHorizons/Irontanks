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
    IRON(32, "ironTank", Arrays.asList("ingotIron", "ingotRefinedIron"), Arrays.asList("tgtg0gtgt", "gggt4tggg"), 3.0F, 5.0F),
    GOLD(48, "goldTank", Collections.singletonList("ingotGold"), Arrays.asList("tgtg1gtgt", "gggt5tggg"), 4.0F, 7.0F),
    DIAMOND(64, "diamondTank", Collections.singletonList("gemDiamond"), Arrays.asList("gggt2tggg", "gggg5gttt"), 6.0F, 8.0F),
    COPPER(27, "copperTank", Collections.singletonList("ingotCopper"), Collections.singletonList("tgtg0gtgt"), 2.0F, 4.0F),
    SILVER(43, "silverTank", Collections.singletonList("ingotSilver"), Arrays.asList("tgtg4gtgt", "gggt1tggg"), 5.0F, 6.0F),
    OBSIDIAN(64, "obsidianTank", Collections.singletonList("obsidian"), Collections.singletonList("tgtg3gtgt"), 6000000.0F, 50.0F),
    GLASS(0, "", Collections.singletonList("blockGlass"), Collections.singletonList(""), 0.0F, 0.0F),
	EMERALD(96, "emeraldTank", Collections.singletonList("gemEmerald"), Collections.singletonList("gggt3tggg"), 6.0F, 8.0F);

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

	/**
	 * Hardness of the tank type
	 */
	public final float hardness;

	TankType(int capacity, String name, List<String> materials, List<String> recipes, float resistance, float hardness) {
		this.capacity = capacity;
		this.name = name;
		this.materials = new ArrayList<String>();
		this.recipes = new ArrayList<String>();
		this.resistance = resistance;
		this.hardness = hardness;
		this.materials.addAll(materials);
		this.recipes.addAll(recipes);
	}

}
