package com.teachmeskills.homework_3.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Start");
        boolean isRight = false;
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println();
        while (isRight != true) {
            System.out.println("Enter your number");
            number = scanner.nextInt();
            if (number > 5 && number <= 10) {
                System.out.println("Number fits");
                isRight = true;
            } else {
                System.out.println("Please enter again");
            }
        }
        int[] myArray = new int[number];
        int valueOfSecondArray = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 0 + (int) (Math.random() * 100);
            if (myArray[i] % 2 == 0) {
                valueOfSecondArray++;
            }
        }
        int count = 0;
        int[] myArray2 = new int[valueOfSecondArray];
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] % 2 == 0) {
                myArray2[count] = myArray[j];
                count++;
            }
        }
        System.out.println("first array - " + Arrays.toString(myArray));
        System.out.println("second array - " + Arrays.toString(myArray2));
        System.out.println("End");
    }
}
