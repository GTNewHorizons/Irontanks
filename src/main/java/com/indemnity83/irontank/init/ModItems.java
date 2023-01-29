package com.indemnity83.irontank.init;

import com.indemnity83.irontank.item.ItemGeneric;
import com.indemnity83.irontank.item.ItemTankChanger;
import com.indemnity83.irontank.reference.TankChangerType;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemGeneric ironGoldUpgrade = new ItemTankChanger(TankChangerType.IRONGOLD);
    public static final ItemGeneric goldDiamondUpgrade = new ItemTankChanger(TankChangerType.GOLDDIAMOND);
    public static final ItemGeneric copperSilverUpgrade = new ItemTankChanger(TankChangerType.COPPERSILVER);
    public static final ItemGeneric silverGoldUpgrade = new ItemTankChanger(TankChangerType.SILVERGOLD);
    public static final ItemGeneric copperIronUpgrade = new ItemTankChanger(TankChangerType.COPPERIRON);
    public static final ItemGeneric glassIronUpgrade = new ItemTankChanger(TankChangerType.GLASSIRON);
    public static final ItemGeneric glassCopperUpgrade = new ItemTankChanger(TankChangerType.GLASSCOPPER);
    public static final ItemGeneric diamondObsidianUpgrade = new ItemTankChanger(TankChangerType.DIAMONDOBSIDIAN);
    public static final ItemGeneric diamondEmeraldUpgrade = new ItemTankChanger(TankChangerType.DIAMONDEMERALD);
    public static final ItemGeneric silverDiamondUpgrade = new ItemTankChanger(TankChangerType.SILVERDIAMOND);
    public static final ItemGeneric emeraldStainlesssteelUpgrade = new ItemTankChanger(
            TankChangerType.EMERALDSTAINLESSSTEEL);
    public static final ItemGeneric stainlesssteelTitaniumUpgrade = new ItemTankChanger(
            TankChangerType.STAINLESSSTEELTITANIUM);
    public static final ItemGeneric titaniumTungstensteelUpgrade = new ItemTankChanger(
            TankChangerType.TITANIUMTUNGSTENSTEEL);

    public static void init() {
        GameRegistry.registerItem(ironGoldUpgrade, TankChangerType.IRONGOLD.name);
        GameRegistry.registerItem(goldDiamondUpgrade, TankChangerType.GOLDDIAMOND.name);
        GameRegistry.registerItem(copperSilverUpgrade, TankChangerType.COPPERSILVER.name);
        GameRegistry.registerItem(silverGoldUpgrade, TankChangerType.SILVERGOLD.name);
        GameRegistry.registerItem(copperIronUpgrade, TankChangerType.COPPERIRON.name);
        GameRegistry.registerItem(glassIronUpgrade, TankChangerType.GLASSIRON.name);
        GameRegistry.registerItem(glassCopperUpgrade, TankChangerType.GLASSCOPPER.name);
        GameRegistry.registerItem(diamondObsidianUpgrade, TankChangerType.DIAMONDOBSIDIAN.name);
        GameRegistry.registerItem(diamondEmeraldUpgrade, TankChangerType.DIAMONDEMERALD.name);
        GameRegistry.registerItem(silverDiamondUpgrade, TankChangerType.SILVERDIAMOND.name);
        GameRegistry.registerItem(emeraldStainlesssteelUpgrade, TankChangerType.EMERALDSTAINLESSSTEEL.name);
        GameRegistry.registerItem(stainlesssteelTitaniumUpgrade, TankChangerType.STAINLESSSTEELTITANIUM.name);
        GameRegistry.registerItem(titaniumTungstensteelUpgrade, TankChangerType.TITANIUMTUNGSTENSTEEL.name);
    }
}
