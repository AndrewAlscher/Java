package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (; true;) {
            int a = Integer.parseInt(bufferedReader.readLine());
            sum += a;

            if (a == -1) {
                System.out.println(sum);
                break;
            }



            //sum += a;


        }
    }
}
