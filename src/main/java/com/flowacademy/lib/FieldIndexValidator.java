package com.flowacademy.lib;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.views.MapColors;

import java.util.HashMap;
import java.util.Set;

public class FieldIndexValidator {

    public static String fieldDescriptionValidator(HashMap<String, GameFieldTemplate> map, int X, int Y){
        String gameFieldKey = GameFieldKeyGenerator.gameFieldKeyGenerator(X,Y);
//        if (X > map.length-1 || X < 0 || Y > map[X].length-1 || Y < 0){
//            return "Semmi.";
//        } else {
            return map.get(gameFieldKey).getDescription();
//        }
    }

    public static String fieldFarDescriptionValidator(HashMap<String, GameFieldTemplate> map, int X, int Y){
        String gameFieldKey = GameFieldKeyGenerator.gameFieldKeyGenerator(X,Y);
        if (map.get(gameFieldKey).getFarDescription() != null){
            return "Semmi.";
        } else {
            return map.get(gameFieldKey).getFarDescription();
        }
    }

    public static GameFieldTemplate fieldMoveValidator(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField, int X, int Y){
        AutoFieldGenerator.fieldCompositor(actualField);
        String gameFieldKey = GameFieldKeyGenerator.gameFieldKeyGenerator(X,Y);
        if (!map.get(gameFieldKey).isAccessable()) {
            System.out.println(MapColors.ANSI_RED + map.get(gameFieldKey).getNotAccessibleDescription() + MapColors.ANSI_RESET);
            PlayMain.setTurnNumber(PlayMain.getTurnNumber() - 1);
            return actualField;
        } else {
            String[] mapnameArg = new String[1];
            mapnameArg[0] = "autosave_";
            AutoSaveLoad.autoSave(map,"./FlowAdventuresDataFiles/",mapnameArg);
            return map.get(gameFieldKey);
        }
    }




    /*public static GameFieldTemplate fieldMoveValidatorInfinit(Set<GameFieldTemplate> map, GameFieldTemplate actualField, int X, int Y){
        if (X > map.length-1){
            PlayMain.setMapMaxX(PlayMain.getMapMaxX()+1);
            return actualField;
        } else if (!map[X][Y].isAccessable()) {
            System.out.println(MapColors.ANSI_RED + map[X][Y].getNotAccessibleDescription() + MapColors.ANSI_RESET);
            PlayMain.setTurnNumber(PlayMain.getTurnNumber() - 1);
            return actualField;
        } else {
            return map[X][Y];
        }
    }*/
}
