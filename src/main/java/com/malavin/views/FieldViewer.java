package com.malavin.views;

import com.malavin.lib.FieldIndexValidator;
import com.malavin.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;

public class FieldViewer {

    public static void viewer(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){

        System.out.println(actualField.getDescription());
        System.out.println("Északra" + FieldIndexValidator.fieldFarDescriptionValidator(map, (actualField.getX()), actualField.getY()-1));
        System.out.println("Délre" + FieldIndexValidator.fieldFarDescriptionValidator(map, (actualField.getX()), actualField.getY()+1));
        System.out.println("Keletre" + FieldIndexValidator.fieldFarDescriptionValidator(map, (actualField.getX()+1), actualField.getY()));
        System.out.println("Nyugatra" + FieldIndexValidator.fieldFarDescriptionValidator(map, (actualField.getX()-1), actualField.getY()));
        System.out.println("+========================================================+");

    }
}
