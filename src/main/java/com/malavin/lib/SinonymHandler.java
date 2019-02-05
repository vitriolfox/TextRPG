package com.malavin.lib;

import java.util.HashSet;
import java.util.Set;

public class SinonymHandler {

    protected static String[] northSinonymes = {"észak", "északra", "fel", "felfelé", "előre", "északfelé", "arra", "oda", "mÉ", "É", "é", "N", "n", "North", "north"};
    protected static String[] southSinonymes = {"dél", "délre", "le", "lefelé", "hátra", "délfelé", "erre", "ide", "mD", "D", "d", "S", "s", "South", "south"};
    protected static String[] eastSinonymes = {"kelet", "keletre", "jobbra", "keletfelé", "jobbkézfelé", "amarra", "amoda", "mK", "K", "k", "E", "e", "East", "east"};
    protected static String[] westSinonymes = {"nyugat", "nyugatra", "balra", "nyugatfelé", "balkézfelé", "emerre", "emide", "mNY", "NY", "ny", "W", "w", "West", "west"};
    protected static String[] quitSinonymes = {"kilép", "kilépés", "exit", "quit", "lépj ki"};
    protected static String[] positionSinonymes = {"helyem", "position", "place"};

    public static String[] getNorthSinonymes() {
        return northSinonymes;
    }

    public static String[] getSouthSinonymes() {
        return southSinonymes;
    }

    public static String[] getEastSinonymes() {
        return eastSinonymes;
    }

    public static String[] getWestSinonymes() {
        return westSinonymes;
    }

    public static String[] getQuitSinonymes() {
        return quitSinonymes;
    }

    public static String[] getPositionSinonymes() {
        return positionSinonymes;
    }

    public static Set<String> sinonymSetFill(String[] sinonymSourceArray){
        Set<String> targetSet = new HashSet<>();
        for (int i=0; i<sinonymSourceArray.length; i++){
            targetSet.add(sinonymSourceArray[i]);
        }
        return targetSet;
    }
}
