package com.malavin.controls;

import com.malavin.lib.AutoFieldGenerator;
import com.malavin.lib.NullFieldPreventer;
import com.malavin.lib.field_generatin_grules.RiverGeneratingRules;
import com.malavin.lib.field_generatin_grules.RoadGeneratingRules;
import com.malavin.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;

import static com.malavin.lib.FieldIndexValidator.fieldMoveValidator;

public class Movement {

    public static GameFieldTemplate moveNorth(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        RoadGeneratingRules.roadsNorth();
        AutoFieldGenerator.riverPatternGenerator("N");
        RiverGeneratingRules.riversNorth();
        NullFieldPreventer.minimapCheck();
        return fieldMoveValidator(map, actualField,(actualField.getX()),(actualField.getY()-1));
    }

    public static GameFieldTemplate moveSouth(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        RoadGeneratingRules.roadsSouth();
        AutoFieldGenerator.riverPatternGenerator("S");
        RiverGeneratingRules.riversSouth();
        NullFieldPreventer.minimapCheck();
        return fieldMoveValidator(map, actualField,(actualField.getX()),(actualField.getY()+1));
    }

    public static GameFieldTemplate moveEast(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        RoadGeneratingRules.roadsEast();
        AutoFieldGenerator.riverPatternGenerator("E");
        RiverGeneratingRules.riversEast();
        NullFieldPreventer.minimapCheck();
        return fieldMoveValidator(map, actualField,(actualField.getX()+1),(actualField.getY()));
    }

    public static GameFieldTemplate moveWest(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){
        RoadGeneratingRules.roadsWest();
        AutoFieldGenerator.riverPatternGenerator("W");
        RiverGeneratingRules.riversWest();
        NullFieldPreventer.minimapCheck();
        return fieldMoveValidator(map, actualField,(actualField.getX()-1),(actualField.getY()));
    }

}
