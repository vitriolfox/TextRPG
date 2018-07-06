package com.flowacademy.lib;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class GameMenu {
    public static void gameMenu(HashMap<String, GameFieldTemplate> map, GameFieldTemplate actualField, String filePath, String[] args) {

        String mapName = args[0];
        Scanner scanner = new Scanner(System.in);
        System.out.print("//new   infinit   //load   //save   //save_as   quit: ");
        String menuEntry = scanner.next();
        System.out.println("================================================");

        if (menuEntry.equals("new")) {
            //Map.newMap(args, filePath);
            PlayerCreator.creator();
        } else if (menuEntry.equals("infinit")){
            Map.infinitMap(args, filePath);
            PlayerCreator.creator();
        } else if (menuEntry.equals("load")){
            System.out.print("Map name (.fmap): ");
            String mapLoadName = scanner.next();
            //Map.load(mapLoadName,filePath);
        } else if (menuEntry.equals("save")){
            //Map.save(map,filePath,args);
            gameMenu(map,actualField, filePath, args);
        } else if (menuEntry.equals("save_as")){
            System.out.print("File name: " + mapName + "_");
            String savedGameName = scanner.next();
            //Map.saveAs(map,filePath,args,savedGameName);
            gameMenu(map, actualField, filePath, args);
        } else if (menuEntry.equals("quit")){
            PlayMain.setQuitted(true);
        }
    }
}
