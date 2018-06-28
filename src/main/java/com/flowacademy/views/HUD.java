package com.flowacademy.views;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

public class HUD {
    public static void hud(GameFieldTemplate[][] map, GameFieldTemplate actualField){


        System.out.println("                " + PlayMain.getPlayerCharacter().getName() + " a hős " + PlayMain.getPlayerCharacter().getProfession() + "          ");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("Körök:" + PlayMain.getTurnNumber() + " | HP:" +
        PlayMain.getPlayerCharacter().getHealth() + " | DMG:" + PlayMain.getPlayerCharacter().getDamage() +
        " | DEF:" + PlayMain.getPlayerCharacter().getDefense() + " |");
        System.out.println("+--------------------------------------------------------+\n");

        FieldViewer.viewer(map, actualField);
    }
}
