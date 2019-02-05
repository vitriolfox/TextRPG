package com.malavin.lib;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.malavin.PlayMain;
import com.malavin.models.Gamefield.GameFieldTemplate;
import com.malavin.models.Player.Player;
import com.malavin.models.Player.PlayerClasses.Barbarian;
import com.malavin.models.Player.PlayerClasses.Mage;
import com.malavin.models.Player.PlayerClasses.Paladin;
import com.malavin.models.Player.PlayerClasses.Thief;

import java.io.*;
import java.util.HashMap;

public class AutoSaveLoad {

    public static void initMap() {

        HashMap<String, GameFieldTemplate> map = new HashMap<>();

            try {
                String mapName = "MalavinDataFiles/TestMap_10x10_shortform.fmap";
                GameFieldTemplate gameField;
                BufferedReader br = new BufferedReader(new FileReader(mapName));
                String line = br.readLine();
                String[] splittedline = line.split("_");
                int actualFieldX = Integer.parseInt(splittedline[1]);
                int actualFieldY = Integer.parseInt(splittedline[2]);
                PlayMain.setTurnNumber(Integer.parseInt(splittedline[3]));
                line = br.readLine();
                splittedline = line.split("_");
                PlayMain.setProloge(splittedline[1]);
                line = br.readLine();
                splittedline = line.split("_");
                PlayMain.setEpiloge(splittedline[1]);

                line = br.readLine();    //a testmapon lévő kommentsor kihagyása


                while ((line = br.readLine()) != null) {
                    String[] splittedBlock;
                    splittedline = line.split("/");

                    for(int i=0; i <= splittedline.length-1; i++){

                        splittedBlock = splittedline[i].split(":");
                        gameField = GameFieldCreator.createGameField(splittedBlock);
                        String gameFieldKey = splittedBlock[0] + ":" + splittedBlock[1];
                        gameField.setId(gameFieldKey);
                        map.put(gameFieldKey, gameField);
                        PlayMain.setMap(map);

                    }
                }

                PlayMain.setActualField(map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualFieldX,actualFieldY)));
                String[] mapnameArg = new String[1];
                mapnameArg[0] = "autosave_";



            } catch (IOException e) {
                e.printStackTrace();
            }

        PlayMain.setMap(map);
    }

    public static void autoSave(HashMap<String, GameFieldTemplate> mapToSave, String savePath, String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String mapName = args[0];

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("MalavinDataFiles/TestMap_10x10_shortform.fmap"));
            bw.write("StartingX,StartingY,TurnNumber:_"+PlayMain.getActualField().getX()+"_"+PlayMain.getActualField().getY()+"_"+PlayMain.getTurnNumber()+"\n"+
                    "Prologe:_"+PlayMain.getProloge()+"\n"+
                    "Epiloge:_"+PlayMain.getEpiloge()+"\n"+
                    objectMapper.writeValueAsString(PlayMain.getPlayerCharacter())+"\n");

            for (String gameField : mapToSave.keySet()) {
                    String out = objectMapper.writeValueAsString(GameFieldEncoder.encodeGameField(mapToSave.get(gameField)));
                    objectMapper.writeValue(new File("FlowAdventuresDataFiles/TestMap_10x10_shortform.fmap"), out);
                    bw.write(out);

            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void autoLoad(String mapName, String filePath) {
        HashMap<String, GameFieldTemplate> map = new HashMap<>();

        if (mapName != null) {
            try {
                GameFieldTemplate gameField;
                BufferedReader br = new BufferedReader(new FileReader("MalavinDataFiles/TestMap_10x10_shortform.fmap"));
                String line = br.readLine();
                String[] splittedline = line.split("_");
                int actualFieldX = Integer.parseInt(splittedline[1]);
                int actualFieldY = Integer.parseInt(splittedline[2]);
                PlayMain.setTurnNumber(Integer.parseInt(splittedline[3]));
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

                            String gameFieldKey = mapX + ":" + mapY;
                            gameField.setId(gameFieldKey);
                            map.put(gameFieldKey, gameField);
                            PlayMain.setMap(map);
                        }

                    }
                }

                PlayMain.setActualField(map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualFieldX, actualFieldY)));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        PlayMain.setMap(map);
    }

}
