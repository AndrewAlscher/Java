package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayListString = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            arrayListString.add(bufferedReader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            arrayListString.add(0, arrayListString.get(arrayListString.size() - 1)); // Добавляем последний элемент на первое место.
            arrayListString.remove(arrayListString.size() - 1); // Удаляем последний элемент.
        }

        for (String s : arrayListString) {
            System.out.println(s);
        }

    }
}
