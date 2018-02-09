package com.myname;

import java.util.Random;

public class Coins {


    private static int[][] coinCoordinates = {
            {4, 4},
            {6, 5},
            {4, 8},
    };


    public Coins() {
    }


    // Entities.builder()
    public static String getCoins() {
        String debugTekst = "";
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            debugTekst = debugTekst + coinCoordinates[i][0] * 40 + "," + coinCoordinates[i][1] * 40;
            System.out.println(debugTekst);
            debugTekst = "";

            //viewFromNodeWithBBox(new Circle(15, Color.color(Math.random(), Math.random(), Math.random())));
            //with(new CollidableComponent(true));
            //buildAndAttach(getGameWorld());
        }
        return ".";

    }
}