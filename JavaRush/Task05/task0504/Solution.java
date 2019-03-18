package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat catOne = new Cat("Мурзик", 2, 3, 4);
        Cat catTwo = new Cat("Марсик", 4, 5 , 1);
        Cat catThree = new Cat("Чижик", 1, 4, 7);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}