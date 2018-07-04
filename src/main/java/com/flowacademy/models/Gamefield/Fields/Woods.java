package com.flowacademy.models.Gamefield.Fields;

import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.models.Item.Item;
import com.flowacademy.models.Npc.NpcTemplate;

public class Woods extends GameFieldTemplate {

   public Woods(NpcTemplate npc, Item item, boolean accessable) {
       this.name = "Grassfields";
       this.mapSign = "W";
       this.mapColor = "\u001B[32m";
       this.description = "Árnyas falombok alatt állsz.";
       this.farDescription = " falombok zöldelnek tőled. ";
       this.npc = npc;
       this.item = item;
       this.accessable = accessable;
       this.notAccessibleDescription = "A növényzet túl sűrű, sajnos erre nem tudsz továbmenni!";
   }

    public Woods(int Xcoordinate, int Ycoordinate, boolean accessable) {
        this.x = Xcoordinate;
        this.y = Ycoordinate;
        this.name = "Grassfields";
        this.mapSign = "W";
        this.mapColor = "\u001B[32m";
        this.description = "Árnyas falombok alatt állsz.";
        this.farDescription = " falombok zöldelnek tőled. ";
        this.npc = npc;
        this.item = item;
        this.accessable = accessable;
        this.notAccessibleDescription = "A növényzet túl sűrű, sajnos erre nem tudsz továbmenni!";
    }

    public Woods() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
