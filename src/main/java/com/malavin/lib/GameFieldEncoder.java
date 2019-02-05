package com.malavin.lib;

import com.malavin.models.Gamefield.GameFieldTemplate;

public class GameFieldEncoder {

    public static String encodeGameField (GameFieldTemplate gameField){
        String accessableCode;

        if (gameField.isAccessable()){
            accessableCode = "1";
        } else {
            accessableCode = "0";
        }

        String decomposedStringX = Integer.toString(gameField.getX());
        String decomposedStringY = Integer.toString(gameField.getY());

        String gameFieldCode = decomposedStringX + ":" + decomposedStringY + ":" + gameField.getMapSign() + ":" + "-" + ":" + "-" + ":" + accessableCode + "/";



        return gameFieldCode;
    }

}
