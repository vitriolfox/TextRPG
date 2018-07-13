package com.flowacademy.views;

import com.flowacademy.PlayMain;
import com.flowacademy.lib.GameFieldKeyGenerator;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.ArrayList;
import java.util.HashMap;

public class MapDrawer {

    public static String drawMiniMap() {

        ArrayList<String> mapSigns = new ArrayList<>();
        String outputString = null;
        HashMap <String, GameFieldTemplate> playmainMap = PlayMain.getMap();
        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();
        int minimumMapRangeX = actualX-2;
        int maximumMapRangeX = actualX+2;
        int minimumMapRangeY = actualY-2;
        int maximumMapRangeY = actualY+2;

        System.out.println("+========================================================+");

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
            mapSigns.add("\n");
        }

        for(String x:mapSigns){
            outputString += x;
        }

        return outputString;
    }

    public static void drawMap() {

        HashMap <String, GameFieldTemplate> playmainMap = PlayMain.getMap();
        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();
        int minimumMapRangeX = actualX-2;
        int maximumMapRangeX = actualX+2;
        int minimumMapRangeY = actualY-2;
        int maximumMapRangeY = actualY+2;

        System.out.println("+========================================================+");

        for (int i = minimumMapRangeY; i <= maximumMapRangeY; i++) {
            System.out.printf("                    ");
            for (int j = minimumMapRangeX; j <= maximumMapRangeX; j++) {
                if (i == actualY && j == actualX) {
                    System.out.printf(MapColors.ANSI_RED + "[O]" + MapColors.ANSI_RESET);
                } else if (playmainMap.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)) == null){
                    System.out.printf("0");
                } else {
                    System.out.printf(playmainMap.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)).getMapColor() + "[" + playmainMap.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)).getMapSign() + "]" + MapColors.ANSI_RESET);
                }
            }
            System.out.printf("\n");
        }

        //System.out.println("+========================================================+");

    }

}
