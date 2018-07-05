package com.flowacademy.models.Gamefield.Fields;

import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.models.Item.Item;
import com.flowacademy.models.Npc.NpcTemplate;

public class Rivers extends GameFieldTemplate {
    public Rivers(NpcTemplate npc, Item item, boolean accessable) {
        this.name = "River";
        this.mapSign = "~";
        this.mapColor = "\u001B[34m";
        this.description = "Zúgó folyó partján állsz.";
        this.farDescription = " folyó zúgását hallod. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
        this.notAccessibleDescription = "A folyópart túl meredek, sajnos nem tudsz tovább menni erre!";
    }

    public Rivers(int Xcoordinate, int Ycoordinate, boolean accessable) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.name = "River";
        this.mapSign = "~";
        this.mapColor = "\u001B[34m";
        this.description = "Zúgó folyó partján állsz.";
        this.farDescription = " folyó zúgását hallod. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
        this.notAccessibleDescription = "A folyópart túl meredek, sajnos nem tudsz tovább menni erre!";
    }
    public Rivers() {
    }
}
