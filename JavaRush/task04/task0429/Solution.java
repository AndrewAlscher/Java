package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int[] mas = {a, b, c};

        int countUpperNull = 0, countLowerNull = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                countUpperNull++;
            } else if (mas[i] < 0) {
                countLowerNull++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countLowerNull + "\n" + "количество положительных чисел: " + countUpperNull);

    }
}
