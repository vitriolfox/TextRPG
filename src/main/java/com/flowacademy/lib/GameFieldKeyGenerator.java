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

}
