package com.flowacademy.lib;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.GameFieldTemplate;
import com.flowacademy.models.Player.Player;
import com.flowacademy.models.Player.PlayerClasses.Barbarian;
import com.flowacademy.models.Player.PlayerClasses.Mage;
import com.flowacademy.models.Player.PlayerClasses.Paladin;
import com.flowacademy.models.Player.PlayerClasses.Thief;

import java.io.*;
import java.util.HashMap;

public class AutoSaveLoad {

    public static void initMap(String[] args, String jsonPath) {

        HashMap<String, GameFieldTemplate> map = new HashMap<>();
        if (args.length == 1) {
            try {
                String mapName = args[0];
                GameFieldTemplate gameField;
                BufferedReader br = new BufferedReader(new FileReader(jsonPath + mapName + ".fmap"));
                String line = br.readLine();
                String[] splittedline = line.split("_");
                PlayMain.setMapMaxX(Integer.parseInt(splittedline[1]));
                PlayMain.setMapMaxY(Integer.parseInt(splittedline[2]));
                int actualFieldX = Integer.parseInt(splittedline[3]);
                int actualFieldY = Integer.parseInt(splittedline[4]);
                PlayMain.setTurnNumber(Integer.parseInt(splittedline[5]));
                line = br.readLine();
                splittedline = line.split("_");
                PlayMain.setProloge(splittedline[1]);
                line = br.readLine();
                splittedline = line.split("_");
                PlayMain.setEpiloge(splittedline[1]);


                while ((line = br.readLine()) != null) {
                    String[] splittedBlock;
                    splittedline = line.split("/");

                    for(int i=0; i <= splittedline.length-1; i++){

                        splittedBlock = splittedline[i].split(":");
                        gameField = GameFieldCreator.createGameField(splittedBlock);
                        int mapX = Integer.parseInt(splittedBlock[0]);
                        int mapY = Integer.parseInt(splittedBlock[1]);

                        Integer xMultiply = GameFieldKeyGenerator.coordinateMultiplier(mapX);
                        Integer yMultiply = GameFieldKeyGenerator.coordinateMultiplier(mapY);
                        String gameFieldKey = GameFieldKeyGenerator.gameFieldKeyGenerator(xMultiply, yMultiply);

                        map.put(gameFieldKey, gameField);
                        map.get(gameFieldKey).setId(gameFieldKey);

                    }
                }

                PlayMain.setMap(map);

                Integer actualXMultiply = GameFieldKeyGenerator.coordinateMultiplier(actualFieldX);
                Integer actualYMultiply = GameFieldKeyGenerator.coordinateMultiplier(actualFieldY);
                PlayMain.setActualField(map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualXMultiply, actualYMultiply)));
                String[] mapnameArg = new String[1];
                mapnameArg[0] = "autosave_";
                autoSave(map,"./FlowAdventuresDataFiles/",mapnameArg);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Incorrect starting parameters!");
        }
    }

    public static void autoSave(HashMap<String, GameFieldTemplate> mapToSave, String savePath, String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String mapName = args[0];

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(savePath + mapName + ".fmap"));
            bw.write("MaxX,MaxY,StartingX,StartingY,TurnNumber:_"+PlayMain.getMapMaxX()+"_"+PlayMain.getMapMaxY()+
                    "_"+PlayMain.getActualField().getX()+"_"+PlayMain.getActualField().getY()+"_"+PlayMain.getTurnNumber()+"\n"+
                    "Prologe:_"+PlayMain.getProloge()+"\n"+
                    "Epiloge:_"+PlayMain.getEpiloge()+"\n"+
                    objectMapper.writeValueAsString(PlayMain.getPlayerCharacter())+"\n");

            for (String gameField : mapToSave.keySet()) {
                    String out = objectMapper.writeValueAsString(GameFieldEncoder.encodeGameField(mapToSave.get(gameField)).replaceAll("\"",""));
                    objectMapper.writeValue(new File(savePath + mapName + ".fmap"), out);
                    bw.write(out);

            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void autoLoad(String mapName, String filePath) {
        HashMap<String, GameFieldTemplate> map = null;

        if (mapName != null) {
            try {
                GameFieldTemplate gameField;
                BufferedReader br = new BufferedReader(new FileReader(filePath + mapName + ".fmap"));
                String line = br.readLine();
                String[] splittedline = line.split("_");
                PlayMain.setMapMaxX(Integer.parseInt(splittedline[1]));
                PlayMain.setMapMaxY(Integer.parseInt(splittedline[2]));
                int actualFieldX = Integer.parseInt(splittedline[3]);
                int actualFieldY = Integer.parseInt(splittedline[4]);
                PlayMain.setTurnNumber(Integer.parseInt(splittedline[5]));
                line = br.readLine();
                splittedline = line.split("_");
                PlayMain.setProloge(splittedline[1]);
                line = br.readLine();
                splittedline = line.split("_");
                PlayMain.setEpiloge(splittedline[1]);

                ObjectMapper objectMapper = new ObjectMapper();
                line = br.readLine();
                Player playerObject = objectMapper.readValue(line, Player.class);

                if (playerObject.getProfession().equals("Barbár")){
                    PlayMain.setPlayerCharacter(objectMapper.readValue(line, Barbarian.class));
                } else if (playerObject.getProfession().equals("Mágus")) {
                    PlayMain.setPlayerCharacter(objectMapper.readValue(line, Mage.class));
                } else if (playerObject.getProfession().equals("Paplovag")) {
                    PlayMain.setPlayerCharacter(objectMapper.readValue(line, Paladin.class));
                } else if (playerObject.getProfession().equals("Tolvaj")) {
                    PlayMain.setPlayerCharacter(objectMapper.readValue(line, Thief.class));
                }

                while ((line = br.readLine()) != null) {
                    String[] splittedBlock;
                    splittedline = line.split("\"");

                    for(int i=0; i <= splittedline.length-1; i++){

                        if (!splittedline[i].equals("")) {
                            splittedBlock = splittedline[i].split(":");
                            gameField = GameFieldCreator.createGameField(splittedBlock);
                            int mapX = Integer.parseInt(splittedBlock[0]);
                            int mapY = Integer.parseInt(splittedBlock[1]);

                            //Integer xMultiply = GameFieldKeyGenerator.coordinateMultiplier(mapX);
                            //Integer yMultiply = GameFieldKeyGenerator.coordinateMultiplier(mapY);
                            String gameFieldKey = GameFieldKeyGenerator.gameFieldKeyGenerator(mapX, mapY);

                            map.put(gameFieldKey, gameField);
                            map.get(gameFieldKey).setId(gameFieldKey);
                        }

                    }
                }


                PlayMain.setMap(map);
                Integer actualXMultiply = GameFieldKeyGenerator.coordinateMultiplier(actualFieldX);
                Integer actualYMultiply = GameFieldKeyGenerator.coordinateMultiplier(actualFieldY);
                PlayMain.setActualField(map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualXMultiply, actualYMultiply)));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
