package com.malavin.views;

import com.malavin.PlayMain;
import com.malavin.lib.GameFieldKeyGenerator;
import com.malavin.models.Gamefield.GameFieldTemplate;

import java.util.ArrayList;
import java.util.HashMap;

public class HUD {
    public static void hud(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){


        System.out.println("                " + PlayMain.getPlayerCharacter().getName() + " a hős " + PlayMain.getPlayerCharacter().getProfession() + "          ");
        //System.out.printf(playerStatsHud()+ MapDrawer.drawMiniMap() + "\n");
        System.out.printf(miniMap() + "\n");
        //System.out.println("         Körök:" + PlayMain.getTurnNumber() + " | HP:" + PlayMain.getPlayerCharacter().getHealth() + " | DMG:" + PlayMain.getPlayerCharacter().getDamage() + " | DEF:" + PlayMain.getPlayerCharacter().getDefense() + " |");
        System.out.println("+--------------------------------------------------------+\n");

        FieldViewer.viewer(map, actualField);
    }

    public static String playerStatsHud(){

        String playerStats =
                "| Körök:" + PlayMain.getTurnNumber() + " \n" +
                "| HP:" + PlayMain.getPlayerCharacter().getHealth() + " \n" +
                "| DMG:" + PlayMain.getPlayerCharacter().getDamage() + " \n" +
                "| DEF:" + PlayMain.getPlayerCharacter().getDefense();

        return playerStats;
    }

    public static String miniMap() {

        String[] playerStatList = new String[5];
        playerStatList[0] = "| Körök:" + Integer.toString(PlayMain.getTurnNumber());
        playerStatList[1] = "| HP:" + PlayMain.getPlayerCharacter().getHealth();
        playerStatList[2] = "| DMG:" + PlayMain.getPlayerCharacter().getDamage();
        playerStatList[3] = "| DEF:" + PlayMain.getPlayerCharacter().getDefense();
        playerStatList[4] = "|";

        ArrayList<String> mapSigns = new ArrayList<>();
        String outputString = "";
        HashMap <String, GameFieldTemplate> playmainMap = PlayMain.getMap();
        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();
        int minimumMapRangeX = actualX-2;
        int maximumMapRangeX = actualX+2;
        int minimumMapRangeY = actualY-2;
        int maximumMapRangeY = actualY+2;

        System.out.println("+========================================================+");
        int playerStatListIndexCount = 0;
        for (int i = minimumMapRangeY; i <= maximumMapRangeY; i++) {
            for (int j = minimumMapRangeX; j <= maximumMapRangeX; j++) {
                if (i == actualY && j == actualX) {
                    mapSigns.add(MapColors.ANSI_RED + "[O]" + MapColors.ANSI_RESET);
                } else if (playmainMap.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)) == null){
                    mapSigns.add("0");
                } else {
                    mapSigns.add(playmainMap.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)).getMapColor() + "[" + playmainMap.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)).getMapSign() + "]" + MapColors.ANSI_RESET);
                }
            }
            mapSigns.add(playerStatList[playerStatListIndexCount]);
            playerStatListIndexCount++;
            mapSigns.add("\n");
        }

        for(String x:mapSigns){
            outputString += x;
        }

        return outputString;
    }
}
