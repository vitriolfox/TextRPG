package com.flowacademy.views;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

public class MapDrawer {

    public static void drawMap() {

        GameFieldTemplate[][] playmainMap = PlayMain.getMap();

        for (int i = 0; i <= playmainMap.length-1; i++) {
            for (int j = 0; j <= playmainMap[i].length-1; j++) {
                if (i == PlayMain.getActualField().getY() && j == PlayMain.getActualField().getX()){
                    System.out.printf(MapColors.ANSI_RED + "[O]" + MapColors.ANSI_RESET);
                } else {
                    System.out.printf(playmainMap[j][i].getMapColor() + "[" + playmainMap[j][i].getMapSign() + "]" + MapColors.ANSI_RESET);
                }
            }
            System.out.printf("\n");
        }

        System.out.println("+========================================================+");



    }

}
