package com.malavin.models.Gamefield.Fields;

import com.malavin.lib.GameFieldKeyGenerator;
import com.malavin.models.Gamefield.GameFieldTemplate;

public class Grassfields extends GameFieldTemplate{

    public Grassfields(int Xcoordinate, int Ycoordinate) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.id = GameFieldKeyGenerator.gameFieldKeyGenerator(Xcoordinate,Ycoordinate);
        this.name = "Grassfields";
        this.mapSign = "G";
        this.mapColor = "\u001B[37m";
        this.description = "Zöldellő fűtenger közepén állsz.";
        this.farDescription = " fűtenger zöldelik tőled. ";
        this.notAccessibleDescription = "A növényzet túl sűrű, sajnos erre nem tudsz továbmenni!";
        this.fieldProtection = true;
    }

    public Grassfields() {
    }
}
