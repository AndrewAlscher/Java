package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int max;

        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
        }

        max = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            if (max < strings.get(i).length()) {
                max = strings.get(i).length();
            }
        }

        /* Снова проходим по массиву и выводим самые длинные строки. */
        for (int i = 0; i < strings.size(); i++) {
            /* Находим длину самой длинной строки. */
            if (strings.get(i).length() == max) {
                System.out.println(strings.get(i));
            }
        }


    }
}
