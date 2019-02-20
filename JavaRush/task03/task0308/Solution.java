package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int multiple = 1;
        for (int i = 1; i <= 10; i++) {
            multiple *= i;
        }
        System.out.println(multiple);
    }
}
