package com.malavin.models.Gamefield.Fields;

import com.malavin.lib.GameFieldKeyGenerator;
import com.malavin.models.Gamefield.GameFieldTemplate;

public class Rivers extends GameFieldTemplate {

    public Rivers(int Xcoordinate, int Ycoordinate) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.id = GameFieldKeyGenerator.gameFieldKeyGenerator(Xcoordinate,Ycoordinate);
        this.name = "River";
        this.mapSign = "~";
        this.mapColor = "\u001B[34m";
        this.description = "Zúgó folyó partján állsz.";
        this.farDescription = " folyó zúgását hallod. ";
        this.accessable = false;
        this.notAccessibleDescription = "A folyópart túl meredek, sajnos nem tudsz tovább menni erre!";
        this.fieldProtection = true;
    }
    public Rivers() {
    }
}
