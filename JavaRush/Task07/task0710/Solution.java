package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayListString = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arrayListString.add(0, bufferedReader.readLine());
        }

        for (String stringItem : arrayListString) {
            System.out.println(stringItem);
        }

    }
}
