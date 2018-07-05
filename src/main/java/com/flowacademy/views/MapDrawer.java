package com.flowacademy.views;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;

public class MapDrawer {

    public static void drawMap() {

        HashMap <String, GameFieldTemplate> playmainMap = PlayMain.getMap();
        String gamefieldKey

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i == PlayMain.getActualField().getY() && j == PlayMain.getActualField().getX()){
                    System.out.printf(MapColors.ANSI_RED + "[O]" + MapColors.ANSI_RESET);
                } else {
                    System.out.printf(playmainMap.get().getMapColor() + "[" + playmainMap[j][i].getMapSign() + "]" + MapColors.ANSI_RESET);
                }
            }
            System.out.printf("\n");
        }

        System.out.println("+========================================================+");



    }

}
