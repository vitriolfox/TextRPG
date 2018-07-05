package com.flowacademy.lib;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.views.MapColors;

import java.util.Set;

public class FieldIndexValidator {
 /*   public static String fieldDescriptionValidator(Set<GameFieldTemplate> map, int X, int Y){
        if (X > map.length-1 || X < 0 || Y > map[X].length-1 || Y < 0){
            return "Semmi.";
        } else {
            return map[X][Y].getDescription();
        }
    }

    public static String fieldFarDescriptionValidator(Set<GameFieldTemplate> map, int X, int Y){
        if (X > map.length-1 || X < 0 || Y > map[X].length-1 || Y < 0){
            return "Semmi.";
        } else {
            return map[X][Y].getFarDescription();
        }
    }*/

    public static GameFieldTemplate fieldMoveValidator(Set<GameFieldTemplate> map, GameFieldTemplate actualField, int X, int Y){
        if (map.contains()) {
            System.out.println(MapColors.ANSI_RED + map[X][Y].getNotAccessibleDescription() + MapColors.ANSI_RESET);
            PlayMain.setTurnNumber(PlayMain.getTurnNumber() - 1);
            return actualField;
        } else {
            return map[X][Y];
        }
    }


    public static GameFieldTemplate fieldMoveValidatorInfinit(Set<GameFieldTemplate> map, GameFieldTemplate actualField, int X, int Y){
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
    }
}
