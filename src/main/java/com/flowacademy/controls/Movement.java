package com.flowacademy.controls;

import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;

import static com.flowacademy.lib.FieldIndexValidator.fieldMoveValidator;

public class Movement {

    public static GameFieldTemplate moveNorth(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()),(actualField.getY()-1));
    }

    public static GameFieldTemplate moveSouth(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()),(actualField.getY()+1));
    }

    public static GameFieldTemplate moveEast(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()+1),(actualField.getY()));
    }

    public static GameFieldTemplate moveWest(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()-1),(actualField.getY()));
    }

}
