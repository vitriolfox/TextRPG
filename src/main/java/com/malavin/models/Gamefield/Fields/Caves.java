package com.malavin.models.Gamefield.Fields;

import com.malavin.lib.GameFieldKeyGenerator;
import com.malavin.models.Gamefield.GameFieldTemplate;

public class Caves extends GameFieldTemplate{

    public Caves(int Xcoordinate, int Ycoordinate) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.id = GameFieldKeyGenerator.gameFieldKeyGenerator(Xcoordinate,Ycoordinate);
        this.name = "Caves";
        this.mapSign = "C";
        this.mapColor = "\u001B[30m";
        this.description = "Sötét és nyirkos barlangban állsz.";
        this.farDescription = " barlang sötétje tátong. ";
        this.notAccessibleDescription = "Fekete szakadék tátong a barlang szájánál, erre nem tudsz továbmenni!";
        this.fieldProtection = true;
    }

    public Caves() {
    }
}
