package com.malavin.lib;

import com.malavin.PlayMain;
import com.malavin.models.Gamefield.GameFieldTemplate;
import com.malavin.views.MapColors;

import java.util.HashMap;

public class FieldIndexValidator {

    public static String fieldFarDescriptionValidator(HashMap<String, GameFieldTemplate> map, int X, int Y){

        String gameFieldKey = GameFieldKeyGenerator.gameFieldKeyGenerator(X,Y);

        if (map.get(gameFieldKey).getFarDescription() != null){
            return map.get(gameFieldKey).getFarDescription();
        } else {
            return "Semmi.";
        }
    }

    public static GameFieldTemplate fieldMoveValidator(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField, int X, int Y){

        AutoFieldGenerator.fieldCompositor();

        String gameFieldKey = GameFieldKeyGenerator.gameFieldKeyGenerator(X,Y);

        if (!map.get(gameFieldKey).isAccessable()) {
            System.out.println(MapColors.ANSI_RED + map.get(gameFieldKey).getNotAccessibleDescription() + MapColors.ANSI_RESET);
            PlayMain.setTurnNumber(PlayMain.getTurnNumber() - 1);
            return actualField;
        } else {
            return map.get(gameFieldKey);
        }
    }
}
