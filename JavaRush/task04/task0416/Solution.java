package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double time = Double.parseDouble(bufferedReader.readLine());

        time %= 5; // Получаем остаток от деления на 5, т.к. зеленый, желтый и красный в совокупности горят 5 минут.

        if (time >= 0 && time < 3.0) {
            System.out.println("зеленый");
        } else if (time >= 3.0 && time < 4.0) {
            System.out.println("желтый");
        } else {
            System.out.println("красный");
        }
    }
}