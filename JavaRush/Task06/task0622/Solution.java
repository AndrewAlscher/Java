package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mas = new int[5];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] < mas[j] && i != j) {
                    int buf = mas[i];
                    mas[i] = mas[j];
                    mas[j] = buf;
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
