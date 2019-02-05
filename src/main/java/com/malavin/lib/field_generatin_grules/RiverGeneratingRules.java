package com.malavin.lib.field_generatin_grules;

import com.malavin.PlayMain;
import com.malavin.lib.GameFieldKeyGenerator;
import com.malavin.lib.GameFieldPatternLoader;
import com.malavin.models.Gamefield.Fields.Bridges;
import com.malavin.models.Gamefield.Fields.Rivers;
import com.malavin.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class RiverGeneratingRules {

    public static void riversNorth() {
        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();
        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();

        GameFieldTemplate[] north5List = new GameFieldTemplate[11];

        north5List[0] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY - 5));
        north5List[1] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 4, actualY - 5));
        north5List[2] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 3, actualY - 5));
        north5List[3] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 2, actualY - 5));
        north5List[4] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 1, actualY - 5));
        north5List[5] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX, actualY - 5));
        north5List[6] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 1, actualY - 5));
        north5List[7] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 2, actualY - 5));
        north5List[8] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 3, actualY - 5));
        north5List[9] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 4, actualY - 5));
        north5List[10] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 5, actualY - 5));

        for (int i = 1; i < north5List.length; i++) {
            int randomCoordinateVariable = ThreadLocalRandom.current().nextInt(-1, 2);
            int randomFieldTypeVariable = ThreadLocalRandom.current().nextInt(0, 101);

            if (north5List[i] != null && map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY - 6)) == null) {

                if (north5List[i].getMapSign().equals("~")) {

                    if (randomFieldTypeVariable > 90) {
                        GameFieldPatternLoader.loadPatternRelativeToField("FlowAdventuresDataFiles/FieldPatterns/RiverPatterns/", "N1", north5List[i].getId());
                    } else {
                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY - 6), new Rivers(actualX - 5 + i + randomCoordinateVariable, actualY - 6));
                    }

                } else if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY - 6)) != null && north5List[i].getMapSign().equals("B")) {

                    if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY - 6)).getMapSign().equals("R")) {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY - 6), new Bridges(actualX - 5 + i + randomCoordinateVariable, actualY - 6));

                    } else {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY - 6), new Rivers(actualX - 5 + i + randomCoordinateVariable, actualY - 6));

                    }

                }

            } else if (north5List[i] != null && north5List[i].getMapSign().equals("~") && map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY - 6)).getMapSign().equals("R")) {

                map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY - 6), new Bridges(actualX - 5 + i + randomCoordinateVariable, actualY - 6));

            }
        }


    }


    public static void riversSouth() {
        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();
        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();

        GameFieldTemplate[] south5List = new GameFieldTemplate[11];

        south5List[0] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY + 5));
        south5List[1] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 4, actualY + 5));
        south5List[2] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 3, actualY + 5));
        south5List[3] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 2, actualY + 5));
        south5List[4] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 1, actualY + 5));
        south5List[5] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX, actualY + 5));
        south5List[6] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 1, actualY + 5));
        south5List[7] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 2, actualY + 5));
        south5List[8] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 3, actualY + 5));
        south5List[9] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 4, actualY + 5));
        south5List[10] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 5, actualY + 5));

        for (int i = 1; i < south5List.length; i++) {
            int randomCoordinateVariable = ThreadLocalRandom.current().nextInt(-1, 2);
            int randomFieldTypeVariable = ThreadLocalRandom.current().nextInt(0, 101);

            if (south5List[i] != null && map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY + 6)) == null) {

                if (south5List[i].getMapSign().equals("~")) {

                    if (randomFieldTypeVariable > 90) {

                        GameFieldPatternLoader.loadPatternRelativeToField("FlowAdventuresDataFiles/FieldPatterns/RiverPatterns/", "S1", south5List[i].getId());

                    } else {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY + 6), new Rivers(actualX - 5 + i + randomCoordinateVariable, actualY + 6));
                    }

                } else if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX- 5 + i + randomCoordinateVariable, actualY + 6)) != null && south5List[i].getMapSign().equals("B")) {

                    if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY + 6)).getMapSign().equals("R")) {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY + 6), new Bridges(actualX - 5 + i + randomCoordinateVariable, actualY + 6));

                    } else {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY + 6), new Rivers(actualX - 5 + i + randomCoordinateVariable, actualY + 6));
                    }

                } else if (south5List[i] != null && south5List[i].getMapSign().equals("~") && map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY + 6)).getMapSign().equals("R")) {

                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5 + i + randomCoordinateVariable, actualY + 6), new Bridges(actualX - 5 + i + randomCoordinateVariable, actualY + 6));

                }

            }
        }
    }





    public static void riversEast(){
        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();
        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();

        GameFieldTemplate[] east5List = new GameFieldTemplate[11];

        east5List[0] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY-5));
        east5List[1] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY-4));
        east5List[2] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY-3));
        east5List[3] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY-2));
        east5List[4] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY-1));
        east5List[5] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY));
        east5List[6] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY+1));
        east5List[7] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY+2));
        east5List[8] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY+3));
        east5List[9] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY+4));
        east5List[10] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY+5));

        for (int i=1; i<east5List.length; i++){
            int randomCoordinateVariable = ThreadLocalRandom.current().nextInt(-1, 2);
            int randomFieldTypeVariable = ThreadLocalRandom.current().nextInt(0, 101);

            if (east5List[i]!=null && map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+6, actualY-5+i+randomCoordinateVariable)) == null){

                if (east5List[i].getMapSign().equals("~")){

                    if (randomFieldTypeVariable > 90){

                        GameFieldPatternLoader.loadPatternRelativeToField("FlowAdventuresDataFiles/FieldPatterns/RiverPatterns/","E1", east5List[i].getId());

                    } else {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 6, actualY - 5 + i + randomCoordinateVariable), new Rivers(actualX + 6, actualY - 5 + i + randomCoordinateVariable));
                    }

                } else if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+6, actualY-5+i+randomCoordinateVariable)) != null && east5List[i].getMapSign().equals("B")){

                    if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+6, actualY-5+i+randomCoordinateVariable)).getMapSign().equals("R")) {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+6, actualY-5+i+randomCoordinateVariable), new Bridges(actualX+6, actualY-5+i+randomCoordinateVariable));

                    } else {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX + 6, actualY - 5 + i + randomCoordinateVariable), new Rivers(actualX + 6, actualY - 5 + i + randomCoordinateVariable));
                    }

                } else if (east5List[i]!=null && east5List[i].getMapSign().equals("~") && map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+6, actualY-5+i+randomCoordinateVariable)).getMapSign().equals("R")) {

                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+6, actualY-5+i+randomCoordinateVariable), new Bridges(actualX+6, actualY-5+i+randomCoordinateVariable));

                }
            }
        }
    }


    public static void riversWest() {
        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();
        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();

        GameFieldTemplate[] west5List = new GameFieldTemplate[11];

        west5List[0] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY - 5));
        west5List[1] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY - 4));
        west5List[2] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY - 3));
        west5List[3] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY - 2));
        west5List[4] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY - 1));
        west5List[5] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY));
        west5List[6] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY + 1));
        west5List[7] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY + 2));
        west5List[8] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY + 3));
        west5List[9] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY + 4));
        west5List[10] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 5, actualY + 5));

        for (int i = 1; i < west5List.length; i++) {
            int randomCoordinateVariable = ThreadLocalRandom.current().nextInt(-1, 2);
            int randomFieldTypeVariable = ThreadLocalRandom.current().nextInt(0, 101);

            if (west5List[i] != null && map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-6, actualY-5 + i + randomCoordinateVariable)) == null) {

                if (west5List[i].getMapSign().equals("~")){

                    if (randomFieldTypeVariable > 90){

                        GameFieldPatternLoader.loadPatternRelativeToField("FlowAdventuresDataFiles/FieldPatterns/RiverPatterns/","W1",west5List[i].getId());

                    } else {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 6, actualY - 5 + i + randomCoordinateVariable), new Rivers(actualX - 6, actualY - 5 + i + randomCoordinateVariable));

                    }
                } else if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-6, actualY-5+i+randomCoordinateVariable)) != null && west5List[i].getMapSign().equals("B")){

                    if (map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-6, actualY-5+i+randomCoordinateVariable)).getMapSign().equals("R")) {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-6, actualY-5+i+randomCoordinateVariable), new Bridges(actualX-6, actualY-5+i+randomCoordinateVariable));

                    } else {

                        map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX - 6, actualY - 5 + i + randomCoordinateVariable), new Rivers(actualX - 6, actualY - 5 + i + randomCoordinateVariable));

                    }

                } else if (west5List[i]!=null && west5List[i].getMapSign().equals("~") && map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-6, actualY-5+i+randomCoordinateVariable)).getMapSign().equals("R")) {

                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-6, actualY-5+i+randomCoordinateVariable), new Bridges(actualX-6, actualY-5+i+randomCoordinateVariable));

                }
            }
        }
    }


}