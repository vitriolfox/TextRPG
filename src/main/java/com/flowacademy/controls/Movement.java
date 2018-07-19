package com.flowacademy.controls;

import com.flowacademy.lib.field_generatin_grules.RiverGeneratingRules;
import com.flowacademy.lib.field_generatin_grules.RoadGeneratingRules;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;

import static com.flowacademy.lib.FieldIndexValidator.fieldMoveValidator;

public class Movement {

    public static GameFieldTemplate moveNorth(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        RoadGeneratingRules.roadsNorth();
        RiverGeneratingRules.riversNorth();
        return fieldMoveValidator(map, actualField,(actualField.getX()),(actualField.getY()-1));
    }

    public static GameFieldTemplate moveSouth(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        RoadGeneratingRules.roadsSouth();
        RiverGeneratingRules.riversSouth();
        return fieldMoveValidator(map, actualField,(actualField.getX()),(actualField.getY()+1));
    }

    public static GameFieldTemplate moveEast(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        RoadGeneratingRules.roadsEast();
        RiverGeneratingRules.riversEast();
        return fieldMoveValidator(map, actualField,(actualField.getX()+1),(actualField.getY()));
    }

    public static GameFieldTemplate moveWest(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        RoadGeneratingRules.roadsWest();
        RiverGeneratingRules.riversWest();
        return fieldMoveValidator(map, actualField,(actualField.getX()-1),(actualField.getY()));
    }

}
