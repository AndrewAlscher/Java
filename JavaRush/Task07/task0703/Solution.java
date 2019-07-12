package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] masString = new String[10];
        int[] masInt = new int[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            masString[i] = bufferedReader.readLine();
            masInt[i] = masString[i].length();
            System.out.println(masInt[i]);
        }
    }
}
