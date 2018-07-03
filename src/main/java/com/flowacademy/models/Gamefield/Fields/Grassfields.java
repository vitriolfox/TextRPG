package com.flowacademy.models.Gamefield.Fields;

import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.models.Item.Item;
import com.flowacademy.models.Npc.NpcTemplate;
import com.flowacademy.views.MapColors;

public class Grassfields extends GameFieldTemplate{
    public Grassfields(NpcTemplate npc, Item item, boolean accessable) {
        this.name = "Grassfields";
        this.mapSign = "G";
        this.mapColor = "\u001B[32m";
        this.description = "Zöldellő fűtenger közepén állsz.";
        this.farDescription = " fűtenger zöldelik tőled. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
    }

    public Grassfields(int Xcoordinate, int Ycoordinate, boolean accessable) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.name = "Grassfields";
        this.mapSign = "G";
        this.mapColor = "\u001B[32m";
        this.description = "Zöldellő fűtenger közepén állsz.";
        this.farDescription = " fűtenger zöldelik tőled. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
    }

    public Grassfields() {
    }
}
