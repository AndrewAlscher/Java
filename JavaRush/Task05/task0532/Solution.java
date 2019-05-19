package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.parseInt(reader.readLine());

        if (maximum > 0) {
            int max = 0;
            for (int i = 0; i < maximum; i++) {

                int number = Integer.parseInt(reader.readLine());
                if (i == 0) {
                    max = number; //В самую первую итерацию происходит присвоение максимуму первого введенного значения.
                }
                if (number > max) {
                    max = number; // Каждый раз ищем новое максимальное число.
                }
            }

            maximum = max;
            System.out.println(maximum);
        }

        //напишите тут ваш код


    }
}
