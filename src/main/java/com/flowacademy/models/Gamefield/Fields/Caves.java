package com.flowacademy.models.Gamefield.Fields;

import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.models.Item.Item;
import com.flowacademy.models.Npc.NpcTemplate;

public class Caves extends GameFieldTemplate{

    public Caves(NpcTemplate npc, Item item, boolean accessable) {
        this.name = "Caves";
        this.mapSign = "C";
        this.mapColor = "\u001B[30m";
        this.description = "Sötét és nyirkos barlangban állsz.";
        this.farDescription = " barlang sötétje tátong. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
        this.notAccessibleDescription = "Fekete szakadék tátong a barlang szájánál, erre nem tudsz továbmenni!";
    }

    public Caves(int Xcoordinate, int Ycoordinate, boolean accessable) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.name = "Caves";
        this.mapSign = "C";
        this.mapColor = "\u001B[30m";
        this.description = "Sötét és nyirkos barlangban állsz.";
        this.farDescription = " barlang sötétje tátong. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
        this.notAccessibleDescription = "Fekete szakadék tátong a barlang szájánál, erre nem tudsz továbmenni!";
    }

    public Caves() {
    }
}
