package com.flowacademy.models.Gamefield.Fields;

import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.models.Item.Item;
import com.flowacademy.models.Npc.NpcTemplate;

public class Roads extends GameFieldTemplate {
    /*public Roads(int coordinateNumber, NpcTemplate npc, Item item, boolean accessable) {
        this.coordinateNumber = coordinateNumber;
        this.type = "Roads";
        this.description = "Poros uton állsz.";
        this.farDescription = " egy út kanyarog. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
    }*/

    public Roads(NpcTemplate npc, Item item, boolean accessable) {
        this.name = "Roads";
        this.mapSign = "R";
        this.mapColor = "\u001B[33m";
        this.description = "Poros uton állsz.";
        this.farDescription = " egy út kanyarog. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
        this.notAccessibleDescription = "Az út romos álapotban van, sajnos erre nem tudsz továbmenni!";
    }

    public Roads(int Xcoordinate, int Ycoordinate, boolean accessable) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.name = "Roads";
        this.mapSign = "R";
        this.mapColor = "\u001B[33m";
        this.description = "Poros uton állsz.";
        this.farDescription = " egy út kanyarog. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
        this.notAccessibleDescription = "Az út romos állapotban van, sajnos erre nem tudsz továbmenni!";
    }

    public Roads() {
    }
}
