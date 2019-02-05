package com.malavin;
import com.malavin.controls.CommandHandler;
import com.malavin.lib.GameMenu;
import com.malavin.models.Gamefield.GameFieldTemplate;
import com.malavin.models.Player.Player;
import com.malavin.views.HUD;

import java.util.HashMap;
import java.util.Scanner;

public class PlayMain {

    private static final String MAP_DIRECTORY = "./MalavinDataFiles/";
    private static boolean quitted = false;
    private static GameFieldTemplate actualField = null;
    private static int turnNumber = 0;
    private static Player playerCharacter = null;
    private static HashMap<String, GameFieldTemplate> map = new HashMap<>();
    private static int mapMaxX = 0;
    private static int mapMaxY = 0;
    private static String prologe = null;
    private static String epiloge = null;

    public static String getProloge() {
        return prologe;
    }

    public static void setProloge(String prologe) {
        PlayMain.prologe = prologe;
    }

    public static String getEpiloge() {
        return epiloge;
    }

    public static void setEpiloge(String epiloge) {
        PlayMain.epiloge = epiloge;
    }

    public static int getMapMaxX() {
        return mapMaxX;
    }

    public static void setMapMaxX(int mapMaxX) {
        PlayMain.mapMaxX = mapMaxX;
    }

    public static int getMapMaxY() {
        return mapMaxY;
    }

    public static void setMapMaxY(int mapMaxY) {
        PlayMain.mapMaxY = mapMaxY;
    }

    public static HashMap<String, GameFieldTemplate> getMap() {
        return map;
    }

    public static void setMap(HashMap<String, GameFieldTemplate> map) {
        PlayMain.map = map;
    }

    public static Player getPlayerCharacter() {
        return playerCharacter;
    }

    public static void setPlayerCharacter(Player playerCharacter) {
        PlayMain.playerCharacter = playerCharacter;
    }

    public static int getTurnNumber() {
        return turnNumber;
    }

    public static void setTurnNumber(int turnNumber) {
        PlayMain.turnNumber = turnNumber;
    }

    public static GameFieldTemplate getActualField() {
        return actualField;
    }

    public static void setActualField(GameFieldTemplate actualField) {
        PlayMain.actualField = actualField;
    }

    public static void setQuitted(boolean quitted) {
        PlayMain.quitted = quitted;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GameMenu.gameMenu(map, actualField, MAP_DIRECTORY, args);
        System.out.println(prologe);
        HUD.hud(map, actualField);

        while (!quitted) {

            CommandHandler.commander(scanner.next(),map, actualField, MAP_DIRECTORY, args);

        }

        System.out.println("QUIT");

    }
}

