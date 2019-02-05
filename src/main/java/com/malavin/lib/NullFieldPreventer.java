package com.malavin.lib;

import com.malavin.PlayMain;
import com.malavin.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;

import static com.malavin.lib.AutoFieldGenerator.generateGameField;

public class NullFieldPreventer {

    public static void minimapCheck(){

        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();

        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();
        int minimumMapRangeX = actualX-4;
        int maximumMapRangeX = actualX+4;
        int minimumMapRangeY = actualY-4;
        int maximumMapRangeY = actualY+4;

        for (int i = minimumMapRangeY; i <= maximumMapRangeY; i++) {
            for (int j = minimumMapRangeX; j <= maximumMapRangeX; j++) {
                if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)) != null){
                } else if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)) == null){
                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i), generateGameField(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)));
                }
            }
        }
    }
}
