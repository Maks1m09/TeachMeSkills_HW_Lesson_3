package com.teachmeskills.homework_3.homework6;

import java.util.Arrays;


public class Homework6 {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println();
        String[] myArray = {"Паша", "Маша", "Петя", "Катя"};
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println("End");
    }
}
