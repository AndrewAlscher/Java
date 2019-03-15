package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a == b && a == c && b == c) {
            System.out.println(a);
        } else {
            int[] mas = {a, b, c};
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {
                    if (mas[i] < mas[j]) {
                        int buf = mas[i];
                        mas[i] = mas[j];
                        mas[j] = buf;
                    }
                }
            }

            System.out.println(mas[1]); // Выводим средний элемент в массиве после сортировки.
        }

    }
}
