package com.flowacademy.controls;

import com.flowacademy.models.Gamefield.GameFieldTemplate;

import static com.flowacademy.lib.FieldIndexValidator.fieldMoveValidator;

public class Movement {

    public static GameFieldTemplate moveNorth(GameFieldTemplate[][] map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()-1),(actualField.getY()));
    }

    public static GameFieldTemplate moveSouth(GameFieldTemplate[][] map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()+1),(actualField.getY()));
    }

    public static GameFieldTemplate moveEast(GameFieldTemplate[][] map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()),(actualField.getY()+1));
    }

    public static GameFieldTemplate moveWest(GameFieldTemplate[][] map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()),(actualField.getY()-1));
    }

}
