package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        System.out.print(((a >= 1 && a <= 999) ? ((a % 2 == 0) ? "четное" : "нечетное") : "") + ((a >= 1 && a <= 999) ? ((a / 100 > 0) ? " трехзначное число" : ((a / 10 > 0) ? " двузначное" : " однозначное") + " число") : ""));

    }
}
