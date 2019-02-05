package com.malavin.lib;

import com.malavin.PlayMain;
import com.malavin.models.Gamefield.GameFieldTemplate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class GameFieldPatternLoader {

    public static void loadPatternRelativeToPlayer(String patternPath, String directionNSEW) {

        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();
        GameFieldTemplate actualField = PlayMain.getActualField();

        try {
            String mapName = patternPath + directionNSEW + "2";
            GameFieldTemplate gameField;
            BufferedReader br = new BufferedReader(new FileReader(mapName));

            //az első két sor kihagyása
            String line = br.readLine();
            line = br.readLine();


            while ((line = br.readLine()) != null) {

                String[] splittedBlock;
                splittedBlock = line.split(":");
                int relativeXCoordinate = Integer.parseInt(splittedBlock[0]);
                int relativeYCoordinate = Integer.parseInt(splittedBlock[1]);

                if (directionNSEW.equals("N")) {
                    splittedBlock[0] = Integer.toString(actualField.getX() + relativeXCoordinate);
                    splittedBlock[1] = Integer.toString(actualField.getY() - 6 + relativeYCoordinate);
                } else if (directionNSEW.equals("S")) {
                    splittedBlock[0] = Integer.toString(actualField.getX() + relativeXCoordinate);
                    splittedBlock[1] = Integer.toString(actualField.getY() + 6 + relativeYCoordinate);
                } else if (directionNSEW.equals("E")) {
                    splittedBlock[0] = Integer.toString(actualField.getX() + 6 + relativeXCoordinate);
                    splittedBlock[1] = Integer.toString(actualField.getY() + relativeYCoordinate);
                } else if (directionNSEW.equals("W")) {
                    splittedBlock[0] = Integer.toString(actualField.getX() - 6 + relativeXCoordinate);
                    splittedBlock[1] = Integer.toString(actualField.getY() + relativeYCoordinate);
                }

                gameField = GameFieldCreator.createGameField(splittedBlock);
                String gameFieldKey = splittedBlock[0] + ":" + splittedBlock[1];
                gameField.setId(gameFieldKey);
                if (map.get(gameFieldKey) == null || !map.get(gameFieldKey).isFieldProtection()) {
                    map.put(gameFieldKey, gameField);
                }

            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public static void loadPatternRelativeToField(String patternPath, String patternName, String FieldId) {

        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();
        GameFieldTemplate actualField = PlayMain.getActualField();

        try {
            String mapName = patternPath + patternName;
            GameFieldTemplate gameField;
            BufferedReader br = new BufferedReader(new FileReader(mapName));

            //az első két sor kihagyása
            String line = br.readLine();
            line = br.readLine();


            while ((line = br.readLine()) != null) {

                String[] splittedBlock;
                splittedBlock = line.split(":");
                int relativeXCoordinate = Integer.parseInt(splittedBlock[0]);
                int relativeYCoordinate = Integer.parseInt(splittedBlock[1]);

                splittedBlock[0] = Integer.toString(GameFieldKeyGenerator.decomposeKey(FieldId)[0] + relativeXCoordinate);
                splittedBlock[1] = Integer.toString(GameFieldKeyGenerator.decomposeKey(FieldId)[1] + relativeYCoordinate);

                gameField = GameFieldCreator.createGameField(splittedBlock);
                String gameFieldKey = splittedBlock[0] + ":" + splittedBlock[1];
                gameField.setId(gameFieldKey);
                map.put(gameFieldKey, gameField);

            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}

