package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zergOne = new Zerg();
        Zerg zergTwo = new Zerg();
        Zerg zergThree = new Zerg();
        Zerg zergFour = new Zerg();
        Zerg zergFive = new Zerg();
        Zerg zergSix = new Zerg();
        Zerg zergSeven = new Zerg();
        Zerg zergEight = new Zerg();
        Zerg zergNine = new Zerg();
        Zerg zergTen = new Zerg();

        zergOne.name = "ZergOne";
        zergTwo.name = "ZergTwo";
        zergThree.name = "ZergThree";
        zergFour.name = "ZergFour";
        zergFive.name = "ZergFive";
        zergSix.name = "ZergSix";
        zergSeven.name = "ZergSeven";
        zergEight.name = "ZergEight";
        zergNine.name = "ZergNine";
        zergTen.name = "ZergTen";

        Protoss protossOne = new Protoss();
        Protoss protossTwo = new Protoss();
        Protoss protossThree = new Protoss();
        Protoss protossFour = new Protoss();
        Protoss protossFive = new Protoss();

        protossOne.name = "ProtossOne";
        protossTwo.name = "ProtossTwo";
        protossThree.name = "ProtossThree";
        protossFour.name = "ProtossFour";
        protossFive.name = "ProtossFive";

        Terran terranOne = new Terran();
        Terran terranTwo = new Terran();
        Terran terranThree = new Terran();
        Terran terranFour = new Terran();
        Terran terranFive = new Terran();
        Terran terranSix = new Terran();
        Terran terranSeven = new Terran();
        Terran terranEight = new Terran();
        Terran terranNine = new Terran();
        Terran terranTen = new Terran();
        Terran terranEleven = new Terran();
        Terran terranTwelve = new Terran();

        terranOne.name = "TerranOne";
        terranTwo.name = "TerranTwo";
        terranThree.name = "TerranThree";
        terranFour.name = "TerranFour";
        terranFive.name = "TerranFive";
        terranSix.name = "TerranSix";
        terranSeven.name = "TerranSeven";
        terranEight.name = "TerranEight";
        terranNine.name = "TerranNine";
        terranTen.name = "TerranTen";
        terranEleven.name = "TerranEleven";
        terranTwelve.name = "TerranTwelve";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
