package com.malavin.models.Gamefield.Fields;

import com.malavin.lib.GameFieldKeyGenerator;
import com.malavin.models.Gamefield.GameFieldTemplate;

public class Roads extends GameFieldTemplate {

    public Roads(int Xcoordinate, int Ycoordinate) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.id = GameFieldKeyGenerator.gameFieldKeyGenerator(Xcoordinate,Ycoordinate);
        this.name = "Roads";
        this.mapSign = "R";
        this.mapColor = "\u001B[33m";
        this.description = "Poros uton állsz.";
        this.farDescription = " egy út kanyarog. ";
        this.notAccessibleDescription = "Az út romos állapotban van, sajnos erre nem tudsz továbmenni!";
        this.fieldProtection = true;
    }

    public Roads() {
    }
}
