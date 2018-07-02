package com.flowacademy.views;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

public class MapDrawer {

    public static void drawMap() {

        GameFieldTemplate[][] playmainMap = PlayMain.getMap();

        for (int i = 0; i <= playmainMap.length-1; i++) {
            for (int j =0; j <= playmainMap[i].length; j++) {
                System.out.printf("[X]");
            }
            System.out.println("\n");
        }

    }

}
