package com.flowacademy.lib;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.Fields.*;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class AutoFieldGenerator {

    public static void fieldCompositor(){

        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();

        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();
        int minimumMapRangeX = actualX-5;
        int maximumMapRangeX = actualX+5;
        int minimumMapRangeY = actualY-5;
        int maximumMapRangeY = actualY+5;

        for (int i = minimumMapRangeY; i <= maximumMapRangeY; i++) {
            for (int j = minimumMapRangeX; j <= maximumMapRangeX; j++) {
                if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)) != null){
//                    GameFieldGeneratingRules.inspectField(j,i);
                } else if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)) == null){
                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i), generateGameField(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)));
                }
            }
        }

        PlayMain.setMap(map);

    }

    public static GameFieldTemplate generateGameField(String targetFieldid){

        int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
        GameFieldTemplate generatedField = null;

        if(randomNum <= 60){
            generatedField = new Grassfields(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0],GameFieldKeyGenerator.decomposeKey(targetFieldid)[1],true);
        } else if(randomNum > 60 && randomNum <= 80) {
            generatedField = new Woods(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0], GameFieldKeyGenerator.decomposeKey(targetFieldid)[1], true);
        } else if(randomNum > 80 && randomNum <= 99) {
            generatedField = new Roads(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0], GameFieldKeyGenerator.decomposeKey(targetFieldid)[1], true);
        } else if(randomNum == 100) {
            generatedField = new Rivers(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0], GameFieldKeyGenerator.decomposeKey(targetFieldid)[1], true);
        }

        return generatedField;
    }

}
