package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<Integer> integerArrayListOne = new ArrayList<>();
        ArrayList<Integer> integerArrayListTwo = new ArrayList<>();
        ArrayList<Integer> integerArrayListThree = new ArrayList<>();
        ArrayList<Integer> integerArrayListFour = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            integerArrayListOne.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (int i = 0; i < integerArrayListOne.size(); i++) {
            if (integerArrayListOne.get(i) % 3 == 0) {
                integerArrayListTwo.add(integerArrayListOne.get(i));
            }

            if (integerArrayListOne.get(i) % 2 == 0) {
                integerArrayListThree.add(integerArrayListOne.get(i));
            }

            if (integerArrayListOne.get(i) % 3 != 0 && integerArrayListOne.get(i) % 2 != 0) {
                integerArrayListFour.add(integerArrayListOne.get(i));
            }
        }

        /* Вывод трёх дополнительных списков. */
        printList(integerArrayListTwo);
        printList(integerArrayListThree);
        printList(integerArrayListFour);

    }

    public static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}
