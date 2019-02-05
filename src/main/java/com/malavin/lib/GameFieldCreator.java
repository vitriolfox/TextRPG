package com.malavin.lib;

import com.malavin.models.Gamefield.Fields.*;
import com.malavin.models.Gamefield.GameFieldTemplate;

public class GameFieldCreator {

    public static GameFieldTemplate createGameField(String[] splittedBlock){
        GameFieldTemplate gameField = new GameFieldTemplate();
        int mapX = Integer.parseInt(splittedBlock[0]);
        int mapY = Integer.parseInt(splittedBlock[1]);


        if(splittedBlock[2].equals("G")){

            gameField = new Grassfields(mapX, mapY);

        } else if(splittedBlock[2].equals("~")){

            gameField = new Rivers(mapX, mapY);

        } else if(splittedBlock[2].equals("W")){

            gameField = new Woods(mapX, mapY);

        } else if(splittedBlock[2].equals("R")){

            gameField = new Roads(mapX, mapY);

        }else if(splittedBlock[2].equals("B")){

            gameField = new Bridges(mapX, mapY);

        } else {
            System.out.println("Elhasalt a MapSign azonosító felismerése");
        }

        if(splittedBlock[5].equals("1") || splittedBlock[5].equals("1")) {
            gameField.setAccessable(true);
        } else {
            gameField.setAccessable(false);
        }

        if(splittedBlock[6].equals("1") || splittedBlock[5].equals("1/")) {
            gameField.setFieldProtection(true);
        } else {
            gameField.setFieldProtection(false);
        }

        return gameField;
    }
}
