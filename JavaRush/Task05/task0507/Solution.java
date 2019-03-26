package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0; // Сумма переменных.
        int count = 0; // Счётчик.

        while (true) {
            int a = Integer.parseInt(bufferedReader.readLine());
            if (a == -1) {
                System.out.println(sum / count);
                break;
            }

            count++;
            sum += a;


        }
    }
}

