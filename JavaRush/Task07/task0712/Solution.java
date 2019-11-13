package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayListString = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arrayListString.add(bufferedReader.readLine());
        }

        int min = arrayListString.get(0).length();
        int max = arrayListString.get(0).length();

        /* Находим минимальную и максимальную строку. */
        for (int i = 1; i < arrayListString.size(); i++) {
            if (min > arrayListString.get(i).length()) {
                min = arrayListString.get(i).length();
            }

            if (max < arrayListString.get(i).length()) {
               max = arrayListString.get(i).length();
            }
        }


        for (int i = 0; i < arrayListString.size(); i++) {
            if (arrayListString.get(i).length() == max || arrayListString.get(i).length() == min) {
                System.out.println(arrayListString.get(i));
                break;
            }
        }
    }
}
