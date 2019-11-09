package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayListString = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            arrayListString.add(bufferedReader.readLine());
        }

        int min = arrayListString.get(0).length();

        /* Находим минимальную строку. */
        for (int i = 0; i < arrayListString.size(); i++) {
            if (min > arrayListString.get(i).length()) {
                min = arrayListString.get(i).length();
            }
        }

        for (int i = 0; i < arrayListString.size(); i++) {
            if (arrayListString.get(i).length() == min) {
                System.out.println(arrayListString.get(i));
            }
        }
    }
}
