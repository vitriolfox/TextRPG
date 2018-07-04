package com.flowacademy.lib;

import com.flowacademy.models.Gamefield.Fields.Grassfields;
import com.flowacademy.models.Gamefield.Fields.Rivers;
import com.flowacademy.models.Gamefield.Fields.Woods;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

public class GameFieldCreator {

    public static GameFieldTemplate createGameField(String[] splittedBlock){
        GameFieldTemplate gameField = new GameFieldTemplate();
        int mapX = Integer.parseInt(splittedBlock[0]);
        int mapY = Integer.parseInt(splittedBlock[1]);
        boolean accessible;
        if(splittedBlock[2].equals("G")){

            if(splittedBlock[5].equals("1")) {
                accessible = true;
            } else {
                accessible = false;
            }
            gameField = new Grassfields(mapX, mapY, accessible);

        } else if(splittedBlock[2].equals("~")){

            if(splittedBlock[5].equals("1")) {
                accessible = true;
            } else {
                accessible = false;
            }
            gameField = new Rivers(mapX, mapY, accessible);

        } else if(splittedBlock[2].equals("W")){

            if(splittedBlock[5].equals("1")) {
                accessible = true;
            } else {
                accessible = false;
            }
            gameField = new Woods(mapX, mapY, accessible);

        } else {
            System.out.println("Elhasalt a MapSign azonosító felismerése");
        }

        return gameField;
    }
}
