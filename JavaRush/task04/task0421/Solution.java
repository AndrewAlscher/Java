package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String nameOne = bufferedReader.readLine();
        String nameTwo = bufferedReader.readLine();

        if(nameOne.equals(nameTwo)) {
            System.out.println("Имена идентичны");
        } else if (nameOne.length() == nameTwo.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
