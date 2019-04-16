package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, address, color;
    int age, weight;

    public Cat(String name) {
        this.name = name;
        this.color = "white";
        this.age = 4;
        this.weight = 5;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "white";
        this.weight = 5;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 4;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 4;
    }

    public static void main(String[] args) {

    }
}
