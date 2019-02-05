package com.malavin.models.Gamefield.Fields;

import com.malavin.lib.GameFieldKeyGenerator;
import com.malavin.models.Gamefield.GameFieldTemplate;

public class Woods extends GameFieldTemplate {

    public Woods(int Xcoordinate, int Ycoordinate) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.id = GameFieldKeyGenerator.gameFieldKeyGenerator(Xcoordinate,Ycoordinate);
        this.name = "Grassfields";
        this.mapSign = "W";
        this.mapColor = "\u001B[32m";
        this.description = "Árnyas falombok alatt állsz.";
        this.notAccessibleDescription = "A növényzet túl sűrű, sajnos erre nem tudsz továbmenni!";
        this.fieldProtection = true;
    }

    public Woods() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
