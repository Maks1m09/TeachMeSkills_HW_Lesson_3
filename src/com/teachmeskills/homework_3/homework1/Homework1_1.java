package com.teachmeskills.homework_3.homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1_1 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        int lengthOfTheSecondArray = 0;
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 0 + (int) (Math.random() * 1000);
        }
        System.out.println("Before sorting: " + Arrays.toString(myArray));
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        for (int j = 0; j < myArray.length; j++) {
            if (number != myArray[j]) {
                lengthOfTheSecondArray++;
            }
        }
        int[] myArray2 = new int[lengthOfTheSecondArray];
        int count = 0;
        for (int k = 0; k < myArray.length; k++) {
            if (number != myArray[k]) {
                myArray2[count] = myArray[k];
                count++;
            }
        }
        System.out.println("After sorting: " + Arrays.toString(myArray2));
        System.out.println("End");
    }
}
