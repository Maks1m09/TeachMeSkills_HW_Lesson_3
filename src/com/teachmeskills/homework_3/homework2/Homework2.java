package com.teachmeskills.homework_3.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int arraySize = scanner.nextInt();
        int[] myArray = new int[arraySize];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 0 + (int) (Math.random() * 1000);
        }
        System.out.println("Average - " + Arrays.stream(myArray).average());
        System.out.println("Max - " + Arrays.stream(myArray).max());
        System.out.println("Min - " + Arrays.stream(myArray).min());
        System.out.println("End");
    }
}
