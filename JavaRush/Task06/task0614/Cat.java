package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList();



    /* При каждом создании нового кота кот будет добавляться и в список. */
    public Cat() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat1 = new Cat();
            cats.add(cat1);
        }


        //напишите тут ваш код
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Cat i : cats) {
            System.out.println(i);
        }


    }
}
