package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int one = Integer.parseInt(bufferedReader.readLine());
        int two = Integer.parseInt(bufferedReader.readLine());
        int three = Integer.parseInt(bufferedReader.readLine());

        int[] mas = {one, two, three};

        /* Если хотя бы два числа равны. */
        if (one == two || one == three || two == three) {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {

                    if (mas[i] != mas[j] && i != j) {
                        countOdd++;
                    }
                }

                /* Если есть два совпадения, то отличающийся элемент под номером i. */
                if (countOdd == 2) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
