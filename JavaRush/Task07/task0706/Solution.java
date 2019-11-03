package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] masInteger = new int[15];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < masInteger.length; i++) {
            masInteger[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int even = 0, odd = 0;
        for (int i = 0; i < masInteger.length; i++) {

            /* Для нечетных домов. */
            if (i % 2 == 1) {
                odd += masInteger[i];
            } else { /* Для четных домов. */
                even += masInteger[i];
            }
        }

        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }


    }
}
