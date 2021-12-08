package com.teachmeskills.homework_3.homework7;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] myArray = new int[20];
        int value;
        boolean isSorted = false;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 0 + (int) (Math.random() * 1000);
        }
        System.out.println("Before sorting: " + Arrays.toString(myArray));
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    isSorted = false;
                    value = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = value;
                }
            }
        }
        System.out.println("After sorting: " + Arrays.toString(myArray));
        System.out.println("End");
    }
}
