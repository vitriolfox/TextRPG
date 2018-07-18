package com.flowacademy.lib;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Gamefield.Fields.Rivers;
import com.flowacademy.models.Gamefield.GameFieldTemplate;

import java.util.HashMap;

public class GameFieldGeneratingRules {



    public static void riversNorth(){
        HashMap<String, GameFieldTemplate> map = PlayMain.getMap();
        int actualX = PlayMain.getActualField().getX();
        int actualY = PlayMain.getActualField().getY();
        GameFieldTemplate[] north6List = new GameFieldTemplate[13];
        GameFieldTemplate[] north5List = new GameFieldTemplate[13];

        north6List[0] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-6, actualY-6));
        north6List[1] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-5, actualY-6));
        north6List[2] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-4, actualY-6));
        north6List[3] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-3, actualY-6));
        north6List[4] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-2, actualY-6));
        north6List[5] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-1, actualY-6));
        north6List[6] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX, actualY-6));
        north6List[7] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+1, actualY-6));
        north6List[8] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+2, actualY-6));
        north6List[9] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+3, actualY-6));
        north6List[10] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+4, actualY-6));
        north6List[11] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY-6));
        north6List[12] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+6, actualY-6));

        north5List[1] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-5, actualY-5));
        north5List[2] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-4, actualY-5));
        north5List[3] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-3, actualY-5));
        north5List[4] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-2, actualY-5));
        north5List[5] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX-1, actualY-5));
        north5List[6] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX, actualY-6));
        north5List[7] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+1, actualY-5));
        north5List[8] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+2, actualY-5));
        north5List[9] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+3, actualY-5));
        north5List[10] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+4, actualY-5));
        north5List[11] = map.get(GameFieldKeyGenerator.gameFieldKeyGenerator(actualX+5, actualY-5));


        for(int i=1; i<north6List.length-1; i++){
            String actualFieldSign;
            String north5LeftSign;
            String north5TopSign;
            String north5RightSign;
            String north6PrevSign;
            String north6NextSign;
            int actualFieldX;
            int actualFieldY;
            int north5X;
            int north5Y;

            if (north5List[i] == null){
                north5X = 0;
                north5Y = 0;
            } else {
                north5X = north5List[i].getX();
                north5Y = north5List[i].getY();
            }

            if (north6List[i] == null){
                actualFieldSign = "0";
                actualFieldX = 0;
                actualFieldY = 0;
            } else {
                actualFieldSign = north6List[i].getMapSign();
                actualFieldX = north6List[i].getX();
                actualFieldY = north6List[i].getY();
            }

            if (north6List[i-1] == null){
                north6PrevSign = "0";
            } else {
                north6PrevSign = north6List[i-1].getMapSign();
            }

            if (north6List[i+1] == null){
                north6NextSign = "0";
            } else {
                north6NextSign = north6List[i+1].getMapSign();
            }

            if (north5List[i-1] == null){
                north5LeftSign = "0";
            } else {
                north5LeftSign = north5List[i-1].getMapSign();
            }

            if (north5List[i] == null){
                north5TopSign = "0";
            } else {
                north5TopSign = north5List[i].getMapSign();
            }

            if (north5List[i+1] == null){
                north5RightSign = "0";
            } else {
                north5RightSign = north5List[i+1].getMapSign();
            }


            if (actualFieldSign.equals("~")){

            } else if (actualFieldSign.equals("0") && north5LeftSign.equals("~") ||actualFieldSign.equals("0") && north5TopSign.equals("~") ||actualFieldSign.equals("0") && north5RightSign.equals("~")){

                if(north6List[i] == null && !north6PrevSign.equals("~") && !north6NextSign.equals("~")) {
                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(north5X, north5Y), new Rivers(actualFieldX - 1, actualFieldY - 1));
                }
            }
/*                if(north6List[i-1] == null && !north6TopSign.equals("~") && !north6RightSign.equals("~")){
                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualFieldX-1, actualFieldY-1),new Rivers(actualFieldX-1, actualFieldY-1));
                } else if(north6List[i] == null && !north6LeftSign.equals("~") && !north6RightSign.equals("~")){
                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualFieldX, actualFieldY-1),new Rivers(actualFieldX, actualFieldY-1));
                } else if(north6List[i+1] == null && !north6TopSign.equals("~") && !north6LeftSign.equals("~")){
                    map.put(GameFieldKeyGenerator.gameFieldKeyGenerator(actualFieldX+1, actualFieldY-1),new Rivers(actualFieldX+1, actualFieldY-1));
                }
*/

        }

    }



}