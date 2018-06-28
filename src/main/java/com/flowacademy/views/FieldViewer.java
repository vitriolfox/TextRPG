package com.flowacademy.views;

import com.flowacademy.lib.FieldIndexValidator;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

public class FieldViewer {

    public static void viewer(GameFieldTemplate[][] map, GameFieldTemplate actualField){

        System.out.println("Ez a " + actualField.getDescription() + " számú mező.");
        System.out.println("Északra: " + FieldIndexValidator.fieldDescriptionValidator(map, (actualField.getX()+1), actualField.getY()));
        System.out.println("Délre: " + FieldIndexValidator.fieldDescriptionValidator(map, (actualField.getX()-1), actualField.getY()));
        System.out.println("Keletre: " + FieldIndexValidator.fieldDescriptionValidator(map, (actualField.getX()), actualField.getY()+1));
        System.out.println("Nyugatra: " + FieldIndexValidator.fieldDescriptionValidator(map, (actualField.getX()), actualField.getY()-1));
        System.out.println("+========================================================+");

    }
}
