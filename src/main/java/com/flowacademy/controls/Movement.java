package com.flowacademy.controls;

import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.Set;

import static com.flowacademy.lib.FieldIndexValidator.fieldMoveValidator;

public class Movement {

    public static GameFieldTemplate moveNorth(Set<GameFieldTemplate> map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()),(actualField.getY()-1));
    }

    public static GameFieldTemplate moveSouth(Set<GameFieldTemplate> map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()),(actualField.getY()+1));
    }

    public static GameFieldTemplate moveEast(Set<GameFieldTemplate> map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()+1),(actualField.getY()));
    }

    public static GameFieldTemplate moveWest(Set<GameFieldTemplate> map, GameFieldTemplate actualField){
        return fieldMoveValidator(map, actualField,(actualField.getX()-1),(actualField.getY()));
    }

}
