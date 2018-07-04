package com.flowacademy.lib;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.views.MapColors;

public class FieldIndexValidator {
    public static String fieldDescriptionValidator(GameFieldTemplate[][] map, int X, int Y){
        if (X > map.length-1 || X < 0 || Y > map[X].length-1 || Y < 0){
            return "Semmi.";
        } else {
            return map[X][Y].getDescription();
        }
    }

    public static String fieldFarDescriptionValidator(GameFieldTemplate[][] map, int X, int Y){
        if (X > map.length-1 || X < 0 || Y > map[X].length-1 || Y < 0){
            return "Semmi.";
        } else {
            return map[X][Y].getFarDescription();
        }
    }

    public static GameFieldTemplate fieldMoveValidator(GameFieldTemplate[][] map, GameFieldTemplate actualField, int X, int Y){
        if (X > map.length-1 || X < 0 || Y > map[X].length-1 || Y < 0){
            System.out.println(MapColors.ANSI_RED + "ERRE NEM LEHET MENNI!" + MapColors.ANSI_RESET);
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()-1);
            return actualField;
        } else if (!map[X][Y].isAccessable()) {
            System.out.println(MapColors.ANSI_RED + map[X][Y].getNotAccessibleDescription() + MapColors.ANSI_RESET);
            PlayMain.setTurnNumber(PlayMain.getTurnNumber() - 1);
            return actualField;
        } else {
            return map[X][Y];
        }
    }

    public static GameFieldTemplate fieldAccessValidator(GameFieldTemplate[][] map, GameFieldTemplate actualField, int X, int Y){
        if (!map[X][Y].isAccessable()){
            System.out.println(map[X][Y]);
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()-1);
            return actualField;
        } else {
            return map[X][Y];
        }
    }
}
