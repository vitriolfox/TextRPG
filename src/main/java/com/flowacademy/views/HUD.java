package com.flowacademy.views;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HUD {
    public static void hud(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField){


        System.out.println("                " + PlayMain.getPlayerCharacter().getName() + " a hős " + PlayMain.getPlayerCharacter().getProfession() + "          ");
        //System.out.printf("+-----------------");
        MapDrawer.drawMap();
        //System.out.printf("-----------------+");
        System.out.println("         Körök:" + PlayMain.getTurnNumber() + " | HP:" + PlayMain.getPlayerCharacter().getHealth() + " | DMG:" + PlayMain.getPlayerCharacter().getDamage() + " | DEF:" + PlayMain.getPlayerCharacter().getDefense() + " |");
        System.out.println("+--------------------------------------------------------+\n");

        FieldViewer.viewer(map, actualField);
    }
}
