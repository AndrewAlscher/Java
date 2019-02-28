package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b || a == c) {
            System.out.print(a + " ");
        }
        if (b == c || b == a) {
            System.out.print(b + " ");
        }
        if (c == b || c == a) {
            System.out.print(c + " ");
        }

    }
}