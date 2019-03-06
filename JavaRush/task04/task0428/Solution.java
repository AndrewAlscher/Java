package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int countUpperNull = 0; // Количество введеных положительных чисел.

        int[] mas = {a, b, c};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                countUpperNull++;
            }
        }

        System.out.println(countUpperNull);

    }
}
