package com.flowacademy.models.Gamefield.Fields;

import com.flowacademy.models.Gamefield.GameFieldTemplate;

public class Bridges extends GameFieldTemplate {

    public Bridges(int Xcoordinate, int Ycoordinate) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.name = "Bridges";
        this.mapSign = "B";
        this.mapColor = "\u001B[36m";
        this.description = "Egy öreg hídon állsz";
        this.farDescription = " egy rozoga hidat látsz. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
        this.notAccessibleDescription = "A híd már régen leomlott, sajnos erre nem tudsz továbmenni!";
        this.fieldProtection = true;
    }

    public Bridges() {
    }

}
