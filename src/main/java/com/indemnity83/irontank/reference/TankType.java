package com.indemnity83.irontank.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Defines a type of tank.
 * 
 * Tank definitions include all variables required to create a tank block. A given tank type can have multiple crafting
 * recipes and multiple primary crafting materials
 * 
 * @author Kyle Klaus
 *
 */
public enum TankType {

    IRON(32, "ironTank", Arrays.asList("plateIron"), Arrays.asList("1i1xqxriv"), 3.0F, 5.0F),
    GOLD(48, "goldTank", Collections.singletonList("plateGold"), Arrays.asList("2g2xqxrgv"), 4.0F, 7.0F),
    DIAMOND(64, "diamondTank", Collections.singletonList("plateDiamond"), Arrays.asList("5d5xqxrdv"), 6.0F, 8.0F),
    COPPER(27, "copperTank", Collections.singletonList("plateCopper"), Collections.singletonList("3c3xqxrcv"), 2.0F,
            4.0F),
    SILVER(43, "silverTank", Collections.singletonList("plateSteel"), Arrays.asList("4s4xqxrsv"), 5.0F, 6.0F),
    OBSIDIAN(64, "obsidianTank", Collections.singletonList("plateObsidian"), Collections.singletonList("5o5xqxrov"),
            6000000.0F, 50.0F),
    GLASS(0, "", Collections.singletonList("blockGlass"), Collections.singletonList(""), 0.0F, 0.0F),
    EMERALD(96, "emeraldTank", Collections.singletonList("plateEmerald"), Collections.singletonList("6a6xqxrav"), 6.0F,
            8.0F),
    STAINLESSSTEEL(128, "stainlesssteelTank", Collections.singletonList("plateStainlessSteel"),
            Collections.singletonList("8b8xqxrbv"), 7.0F, 10.0F),
    TITANIUM(256, "titaniumTank", Collections.singletonList("plateTitanium"), Collections.singletonList("9t9xqxrtv"),
            8.0F, 12.0F),
    TUNGSTENSTEEL(512, "tungstensteelTank", Collections.singletonList("plateTungstenSteel"),
            Collections.singletonList("0u0xqxruv"), 10.0F, 15.0F);

    /**
     * fluid capacity of the tank type
     */
    public final int capacity;

    /**
     * The internal name of the tank type
     */
    public final String name;

    /**
     * List of primary crafting materials that may be used in crafting recipe. These materials should substitute for 't'
     * in the recipes list.
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

    TankType(int capacity, String name, List<String> materials, List<String> recipes, float resistance,
            float hardness) {
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
