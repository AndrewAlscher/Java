package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int one = Integer.parseInt(bufferedReader.readLine());
        int two = Integer.parseInt(bufferedReader.readLine());

        if (one < two) {
            System.out.println(one);
        } else {
            System.out.println(two);
        }

    }
}