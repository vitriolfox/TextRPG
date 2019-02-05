package com.malavin.models.Gamefield.Fields;

import com.malavin.lib.GameFieldKeyGenerator;
import com.malavin.models.Gamefield.GameFieldTemplate;

public class Lakes extends GameFieldTemplate {

    public Lakes(int Xcoordinate, int Ycoordinate) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.id = GameFieldKeyGenerator.gameFieldKeyGenerator(Xcoordinate,Ycoordinate);
        this.name = "Lake";
        this.mapSign = "~";
        this.mapColor = "\u001B[34m";
        this.description = "Csendes tó partján állsz.";
        this.farDescription = " egy tó csillogását látod. ";
        this.accessable = false;
        this.notAccessibleDescription = "A tóparti növényzet túl sűrű, sajnos nem tudsz tovább menni erre!";
        this.fieldProtection = true;
    }
    public Lakes() {
    }

}
