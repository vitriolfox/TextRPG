package com.flowacademy.models.Gamefield.Fields;

import com.flowacademy.lib.GameFieldKeyGenerator;
import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.models.Item.Item;
import com.flowacademy.models.Npc.NpcTemplate;
import com.flowacademy.views.MapColors;

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
