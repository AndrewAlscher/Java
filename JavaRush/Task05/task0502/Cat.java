package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int countA = 0; // Для счёта.
        int countB = 0; // Для счёта.
        if (this.age < anotherCat.age && this.age > 2) {
            countA++;
        } else {
            countB++;
        }

        if (this.weight > anotherCat.weight) {
            countA++;
        } else {
            countB++;
        }

        if (this.strength > anotherCat.strength) {
            countA++;
        } else {
            countB++;
        }

        if (countA > countB) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
