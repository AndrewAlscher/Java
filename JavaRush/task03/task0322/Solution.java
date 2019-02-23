package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String nameOne = bufferedReader.readLine();
        String nameTwo = bufferedReader.readLine();
        String nameThree = bufferedReader.readLine();

        System.out.println(nameOne + " + " + nameTwo + " + " + nameThree + " = Чистая любовь, да-да!");
    }
}