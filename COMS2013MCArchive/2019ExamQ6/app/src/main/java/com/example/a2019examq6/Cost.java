package com.example.a2019examq6;

public class Cost {

    public double energySaving(int lightsHours, int airHours, int lightNo, int airNo){
        int lightsReplacement = lightNo * 30;
        double lightsCost = lightsHours * 0.1 * 250 * lightNo;
        int airReplacement = airNo * 2000;
        double airCost = airHours * 250 * airNo;

        return  lightsCost + lightsReplacement + airCost + airReplacement;
    }

    public double original(int lightsHours, int airHours, int lightNo, int airNo){

        int lightsReplacement = lightNo * 10;
        double lightsCost = lightsHours * 0.5 * 250 * lightNo;
        int airReplacement = airNo * 1500;
        double airCost = airHours * 1.20 * 250 * airNo;

        return  lightsCost + lightsReplacement + airCost + airReplacement;
    }

}
