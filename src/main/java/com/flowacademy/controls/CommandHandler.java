package com.flowacademy.controls;

import com.flowacademy.PlayMain;
import com.flowacademy.lib.AutoSaveLoad;
import com.flowacademy.lib.GameMenu;
import com.flowacademy.lib.SinonymHandler;
import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.views.HUD;
import com.flowacademy.views.MapDrawer;

import java.util.HashMap;
import java.util.HashSet;
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
            //AutoSaveLoad.autoLoad("autosave_","./FlowAdventuresDataFiles/");
            PlayMain.setActualField(Movement.moveNorth(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
            MapDrawer.drawMap();
        } else if (southSinonymSet.contains(input)){
            //AutoSaveLoad.autoLoad("autosave_","./FlowAdventuresDataFiles/");
            PlayMain.setActualField(Movement.moveSouth(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
            MapDrawer.drawMap();
        } else if (eastSinonymSet.contains(input)){
            //AutoSaveLoad.autoLoad("autosave_","./FlowAdventuresDataFiles/");
            PlayMain.setActualField(Movement.moveEast(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
            MapDrawer.drawMap();
        } else if (westSinonymSet.contains(input)){
            //AutoSaveLoad.autoLoad("autosave_","./FlowAdventuresDataFiles/");
            PlayMain.setActualField(Movement.moveWest(map,actualField));
            PlayMain.setTurnNumber(PlayMain.getTurnNumber()+1);
            HUD.hud(map, PlayMain.getActualField());
            MapDrawer.drawMap();
        } else if (quitSinonymSet.contains(input)){
            PlayMain.setQuitted(true);
        } else if (positionSinonymSet.contains(input)){
            HUD.hud(map, actualField);
        } else if (input.equals("menu")){
            GameMenu.gameMenu(map,actualField, filePath, args);
        } else if (input.equals("map") || input.equals("drawmap")){
            MapDrawer.drawMap();
        }
    }
}
