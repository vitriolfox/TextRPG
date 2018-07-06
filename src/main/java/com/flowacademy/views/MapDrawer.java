package com.flowacademy.views;

import com.flowacademy.PlayMain;
import com.flowacademy.lib.GameFieldKeyGenerator;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;

public class MapDrawer {

    public static void drawMap() {

        HashMap <String, GameFieldTemplate> playmainMap = PlayMain.getMap();
        Integer[] decomposedActualFieldKey = GameFieldKeyGenerator.decomposeKey(PlayMain.getActualField().getId());
        int minimumMapRangeX = decomposedActualFieldKey[0]-2;
        int maximumMapRangeX = decomposedActualFieldKey[0]+2;
        int minimumMapRangeY = decomposedActualFieldKey[1]-2;
        int maximumMapRangeY = decomposedActualFieldKey[1]+2;

        for (int i = minimumMapRangeY; i <= maximumMapRangeY; i++) {
            for (int j = minimumMapRangeX; j <= maximumMapRangeX; j++) {
                if (i == decomposedActualFieldKey[1] && j == decomposedActualFieldKey[0]){
                    System.out.printf(MapColors.ANSI_RED + "[O]" + MapColors.ANSI_RESET);
                } else {
                    System.out.printf(playmainMap.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)).getMapColor() + "[" + playmainMap.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)).getMapSign() + "]" + MapColors.ANSI_RESET);
                }
            }
            System.out.printf("\n");
        }

        System.out.println("+========================================================+");



    }

}
