package com.flowacademy.lib;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.Fields.Grassfields;
import com.flowacademy.models.Gamefield.Fields.Rivers;
import com.flowacademy.models.Gamefield.Fields.Roads;
import com.flowacademy.models.Gamefield.Fields.Woods;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class AutoFieldGenerator {

    public static HashMap<String, GameFieldTemplate> fieldCompositor (GameFieldTemplate actualField){

        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();

        Integer[] decomposedActualFieldKey = GameFieldKeyGenerator.decomposeKey(PlayMain.getActualField().getId());
        int minimumMapRangeX = decomposedActualFieldKey[0]-5;
        int maximumMapRangeX = decomposedActualFieldKey[0]+5;
        int minimumMapRangeY = decomposedActualFieldKey[1]-5;
        int maximumMapRangeY = decomposedActualFieldKey[1]+5;

        for (int i = minimumMapRangeY; i <= maximumMapRangeY; i++) {
            for (int j = minimumMapRangeX; j <= maximumMapRangeX; j++) {
                if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)) == null){
                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i), generateGameField(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)));
                }
            }
        }

        PlayMain.setMap(map);
        return map;
    }

    public static GameFieldTemplate generateGameField(String targetFieldid){

        int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
        GameFieldTemplate generatedField = null;

        if(randomNum == 1){
            generatedField = new Grassfields(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0],GameFieldKeyGenerator.decomposeKey(targetFieldid)[1],true);
        } else if(randomNum == 2){
            generatedField = new Rivers(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0],GameFieldKeyGenerator.decomposeKey(targetFieldid)[1],false);
        } else if(randomNum == 3) {
            generatedField = new Woods(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0], GameFieldKeyGenerator.decomposeKey(targetFieldid)[1], true);
        } else if(randomNum == 4) {
            generatedField = new Roads(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0], GameFieldKeyGenerator.decomposeKey(targetFieldid)[1], false);
        }

        return generatedField;
    }

}
