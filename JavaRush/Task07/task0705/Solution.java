package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] masInteger = new int[20];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < masInteger.length; i++) {
            masInteger[i] = Integer.parseInt(bufferedReader.readLine());
        }


        int[] masIntegerLessOne = new int[10];
        int[] masIntegerLessTwo = new int[10];

        for (int i = 0; i < masInteger.length / 2; i++) {
            masIntegerLessOne[i] = masInteger[i];
        }

        for (int i = (masInteger.length / 2), j = 0; i < masInteger.length; i++, j++) {
            masIntegerLessTwo[j] = masInteger[i];
            System.out.println(masIntegerLessTwo[j]);
        }


    }
}
