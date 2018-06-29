package com.flowacademy.controls;

import com.flowacademy.PlayMain;
import com.flowacademy.lib.GameMenu;
import com.flowacademy.lib.SinonymHandler;
import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.views.HUD;

import java.util.Set;

public class CommandHandler {

    protected static Set<String> northSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getNorthSinonymes());
    protected static Set<String> southSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getSouthSinonymes());
    protected static Set<String> eastSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getEastSinonymes());
    protected static Set<String> westSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getWestSinonymes());

    protected static Set<String> quitSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getQuitSinonymes());

    protected static Set<String> positionSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getPositionSinonymes());




    public static void commander(String input, GameFieldTemplate[][] map, GameFieldTemplate actualField, String filePath, String[] args){

        if (northSinonymSet.contains(input)){
            PlayMain.setActualField(Movement.moveNorth(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
        } else if (southSinonymSet.contains(input)){
            PlayMain.setActualField(Movement.moveSouth(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
        } else if (eastSinonymSet.contains(input)){
            PlayMain.setActualField(Movement.moveEast(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
        } else if (westSinonymSet.contains(input)){
            PlayMain.setActualField(Movement.moveWest(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
        } else if (quitSinonymSet.contains(input)){
            PlayMain.setQuitted(true);
        } else if (positionSinonymSet.contains(input)){
            HUD.hud(map, actualField);
        } else if (input.equals("menu")){
            GameMenu.gameMenu(map,actualField, filePath, args);
        }
    }
}