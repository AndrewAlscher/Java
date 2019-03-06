package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        System.out.println(((a == 0) ? "ноль" : ((a > 0) ? "положительное" : "отрицательное")) + ((a == 0) ? "" : ((a % 2 == 0) ? " четное число" : " нечетное число")));
    }
}
