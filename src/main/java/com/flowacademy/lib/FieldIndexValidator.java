package com.flowacademy.lib;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

public class FieldIndexValidator {
    public static String fieldDescriptionValidator(GameFieldTemplate[][] map, int X, int Y){
        if (X > map.length-1 || X < 0 || Y > map[X].length-1 || Y < 0){
            return "Semmi.";
        } else {
            return map[X][Y].getDescription();
        }
    }

    public static GameFieldTemplate fieldMoveValidator(GameFieldTemplate[][] map, GameFieldTemplate actualField, int X, int Y){
        if (X > map.length-1 || X < 0 || Y > map[X].length-1 || Y < 0){
            System.out.println("ERRE NEM LEHET MENNI!");
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()-1);
            return actualField;
        } else {
            return map[X][Y];
        }
    }
}
