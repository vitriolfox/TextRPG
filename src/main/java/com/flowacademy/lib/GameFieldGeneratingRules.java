package com.flowacademy.lib;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.Fields.Caves;
import com.flowacademy.models.Gamefield.Fields.Grassfields;
import com.flowacademy.models.Gamefield.Fields.Rivers;
import com.flowacademy.models.Gamefield.Fields.Roads;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class GameFieldGeneratingRules {



    public static void riversNorth(){
        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();
        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();
        GameFieldTemplate north6Left6 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-6, actualY-6));
        GameFieldTemplate north6Left5 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-5, actualY-6));
        GameFieldTemplate north6Left4 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-4, actualY-6));
        GameFieldTemplate north6Left3 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-3, actualY-6));
        GameFieldTemplate north6Left2 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-2, actualY-6));
        GameFieldTemplate north6Left1 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-1, actualY-6));
        GameFieldTemplate north60 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX, actualY-6));
        GameFieldTemplate north6Right1 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+1, actualY-6));
        GameFieldTemplate north6Right2 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+2, actualY-6));
        GameFieldTemplate north6Right3 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+3, actualY-6));
        GameFieldTemplate north6Right4 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+4, actualY-6));
        GameFieldTemplate north6Right5 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY-6));
        GameFieldTemplate north6Right6 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+6, actualY-6));

        GameFieldTemplate north5Left6 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-6, actualY-5));
        GameFieldTemplate north5Left5 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-5, actualY-5));
        GameFieldTemplate north5Left4 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-4, actualY-5));
        GameFieldTemplate north5Left3 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-3, actualY-5));
        GameFieldTemplate north5Left2 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-2, actualY-5));
        GameFieldTemplate north5Left1 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-1, actualY-5));
        GameFieldTemplate north50 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX, actualY-6));
        GameFieldTemplate north5Right1 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+1, actualY-5));
        GameFieldTemplate north5Right2 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+2, actualY-5));
        GameFieldTemplate north5Right3 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+3, actualY-5));
        GameFieldTemplate north5Right4 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+4, actualY-5));
        GameFieldTemplate north5Right5 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY-5));
        GameFieldTemplate north5Right6 = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+6, actualY-5));


        if ()

    }



}