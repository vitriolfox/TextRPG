package com.flowacademy.views;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

public class MapDrawer {

    public static void drawMap() {

        GameFieldTemplate[][] playmainMap = PlayMain.getMap();

        for (int i = 0; i <= playmainMap.length-1; i++) {
            for (int j = 0; j <= playmainMap[i].length-1; j++) {
                if (i == PlayMain.getActualField().getX() && j == PlayMain.getActualField().getY()){
                    System.out.printf(MapColors.ANSI_RED + "[O]" + MapColors.ANSI_RESET);
                } else {
                    System.out.printf(playmainMap[i][j].getMapColor() + "[" + playmainMap[i][j].getMapSign() + "]" + MapColors.ANSI_RESET);
                }
            }
            System.out.printf("\n");
        }

        System.out.println("+========================================================+");



    }

}
