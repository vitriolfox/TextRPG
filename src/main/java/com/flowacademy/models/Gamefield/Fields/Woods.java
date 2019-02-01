package com.flowacademy.models.Gamefield.Fields;

import com.flowacademy.lib.GameFieldKeyGenerator;
import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.models.Item.Item;
import com.flowacademy.models.Npc.NpcTemplate;

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
