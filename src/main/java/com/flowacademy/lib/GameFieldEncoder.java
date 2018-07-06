package com.flowacademy.lib;

import com.flowacademy.models.Gamefield.GameFieldTemplate;

public class GameFieldEncoder {

    public static String encodeGameField (GameFieldTemplate gameField){
        String accessableCode;

        if (gameField.isAccessable()){
            accessableCode = "1";
        } else {
            accessableCode = "0";
        }

        Integer[] decomposedFieldKey = GameFieldKeyGenerator.decomposeKey(gameField.getId());
        String decomposedStringX = Integer.toString(decomposedFieldKey[0]);
        String decomposedStringY = Integer.toString(decomposedFieldKey[1]);
        String gameFieldCode = decomposedStringX + ":" + decomposedStringY + ":" + gameField.getMapSign() + ":" + "-" + ":" + "-" + ":" + accessableCode + "/";



        return gameFieldCode;
    }

}
