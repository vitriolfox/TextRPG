package com.malavin.controls;

import com.malavin.PlayMain;
import com.malavin.lib.GameMenu;
import com.malavin.lib.SinonymHandler;
import com.malavin.models.Gamefield.GameFieldTemplate;
import com.malavin.views.HUD;
import com.malavin.views.MapDrawer;

import java.util.HashMap;
import java.util.Set;

public class CommandHandler {

    protected static Set<String> northSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getNorthSinonymes());
    protected static Set<String> southSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getSouthSinonymes());
    protected static Set<String> eastSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getEastSinonymes());
    protected static Set<String> westSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getWestSinonymes());
    protected static Set<String> quitSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getQuitSinonymes());
    protected static Set<String> positionSinonymSet = SinonymHandler.sinonymSetFill(SinonymHandler.getPositionSinonymes());




    public static void commander(String input, HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField, String filePath, String[] args){

        if (northSinonymSet.contains(input)){
            PlayMain.setActualField(Movement.moveNorth(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
            //MapDrawer.drawMiniMap();
        } else if (southSinonymSet.contains(input)){
            PlayMain.setActualField(Movement.moveSouth(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
            //MapDrawer.drawMiniMap();
        } else if (eastSinonymSet.contains(input)){
            PlayMain.setActualField(Movement.moveEast(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
            //MapDrawer.drawMiniMap();
        } else if (westSinonymSet.contains(input)){
            PlayMain.setActualField(Movement.moveWest(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
            //MapDrawer.drawMiniMap();
        } else if (quitSinonymSet.contains(input)){
            PlayMain.setQuitted(true);
        } else if (positionSinonymSet.contains(input)){
            HUD.hud(map, actualField);
        } else if (input.equals("menu")){
            GameMenu.gameMenu(map,actualField, filePath, args);
        } else if (input.equals("map") || input.equals("drawmap")){
            MapDrawer.drawMap();
        } else if (input.equals("m10") || input.equals("map10")){
            MapDrawer.drawLargeMap();
        } else {
            System.out.println("Nem rétettem, valamit elpötyögtél.");
        }
    }
}
