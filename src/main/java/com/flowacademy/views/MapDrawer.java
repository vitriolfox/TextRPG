package com.flowacademy.views;

import com.flowacademy.PlayMain;
import com.flowacademy.lib.GameFieldKeyGenerator;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;

public class MapDrawer {

    public static void drawMap() {

        HashMap <String, GameFieldTemplate> playmainMap = PlayMain.getMap();

        //Integer[] decomposedActualFieldKey = GameFieldKeyGenerator.decomposeKeyMapDrawer(PlayMain.getActualField().getId());
        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();
        int minimumMapRangeX = actualX-2;
        int maximumMapRangeX = actualX+2;
        int minimumMapRangeY = actualY-2;
        int maximumMapRangeY = actualY+2;

        for (int i = minimumMapRangeY; i <= maximumMapRangeY; i++) {
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

        System.out.println("+========================================================+");



    }

}
