package com.malavin.lib;

import com.malavin.PlayMain;
import com.malavin.models.Gamefield.Fields.*;
import com.malavin.models.Gamefield.GameFieldTemplate;

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
                } else if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)) == null){
                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i), generateGameField(GameFieldKeyGenerator.gameFieldKeyGenerator(j,i)));
                }
            }
        }

        PlayMain.setMap(map);

    }

    public static GameFieldTemplate generateGameField(String targetFieldid){

        int randomNum = ThreadLocalRandom.current().nextInt(1, 1001);
        GameFieldTemplate generatedField = null;

        if(randomNum <= 600){
            generatedField = new Grassfields(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0],GameFieldKeyGenerator.decomposeKey(targetFieldid)[1]);
        } else if(randomNum > 600 && randomNum <= 800) {
            generatedField = new Woods(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0], GameFieldKeyGenerator.decomposeKey(targetFieldid)[1]);
        } //else if(randomNum > 800 && randomNum <= 999) {
            //generatedField = new Roads(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0], GameFieldKeyGenerator.decomposeKey(targetFieldid)[1]);
        //}
        else if(randomNum == 1000) {
            generatedField = new Lakes(GameFieldKeyGenerator.decomposeKey(targetFieldid)[0], GameFieldKeyGenerator.decomposeKey(targetFieldid)[1]);
        }

        return generatedField;
    }



    public static void riverPatternGenerator(String directionNSEW){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 1001);


        if (randomNum > 900){
            GameFieldPatternLoader.loadPatternRelativeToPlayer("FlowAdventuresDataFiles/FieldPatterns/RiverPatterns/", directionNSEW);
        }
    }

}
