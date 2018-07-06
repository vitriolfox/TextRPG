package com.flowacademy.lib;

public class GameFieldKeyGenerator {

    public static Integer coordinateMultiplier (int a){
        int coordinate = a+1000000;

        return coordinate;
    }

    public static String gameFieldKeyGenerator (Integer x, Integer y){
        String xString = Integer.toString(x);
        String yString = Integer.toString(y);

        return xString + ":" + yString;
    }

    public static Integer[] decomposeKey(String gameFieldKey){
        String[] splittedKey = gameFieldKey.split(":");
        Integer[] decomposedKey = new Integer[2];
        decomposedKey[0] = Integer.parseInt(splittedKey[0]);
        decomposedKey[1] = Integer.parseInt(splittedKey[1]);

        return decomposedKey;
    }

}
