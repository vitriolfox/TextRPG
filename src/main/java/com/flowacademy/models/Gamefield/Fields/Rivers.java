package com.flowacademy.models.Gamefield.Fields;

import com.flowacademy.lib.GameFieldKeyGenerator;
import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.models.Item.Item;
import com.flowacademy.models.Npc.NpcTemplate;

public class Rivers extends GameFieldTemplate {

    public Rivers(int Xcoordinate, int Ycoordinate) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.id = GameFieldKeyGenerator.gameFieldKeyGenerator(Xcoordinate,Ycoordinate);
        this.name = "River";
        this.mapSign = "~";
        this.mapColor = "\u001B[34m";
        this.description = "Zúgó folyó partján állsz.";
        this.farDescription = " folyó zúgását hallod. ";
        this.accessable = false;
        this.notAccessibleDescription = "A folyópart túl meredek, sajnos nem tudsz tovább menni erre!";
        this.fieldProtection = true;
    }
    public Rivers() {
    }
}
