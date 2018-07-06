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

        String gameFieldCode = gameField.getX() + ":" + gameField.getY() + ":" + gameField.getMapSign()
                + ":" + gameField.getNpc().getNpcSign() + ":" + gameField.getItem().getItemSign() + ":"
                + accessableCode;



        return gameFieldCode;
    }

}
