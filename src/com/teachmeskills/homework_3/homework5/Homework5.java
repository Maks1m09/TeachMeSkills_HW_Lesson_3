package com.teachmeskills.homework_3.homework5;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] myArray = {1, 34, 4, 5, 12, 34, 0, 123, 4, 456, 213, 2};
        System.out.println("Before sorting: " + Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0) {
                myArray[i] = 0;
            }
        }
        System.out.println("After sorting: " + Arrays.toString(myArray));
        System.out.println("End");
    }
}
