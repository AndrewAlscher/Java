package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0; // Для подсчета суммы.

        while(true) {
            String a = bufferedReader.readLine();

            if (a.equals("сумма")) {
                System.out.println(sum);
                break;
            } else {
                sum += Integer.parseInt(a);
            }
        }
    }
}
