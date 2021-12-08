package com.teachmeskills.homework_3.homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] myArray = {5, 10, 14, 10, 12, 3, 4, 5};
        System.out.println("Before processing - " + Arrays.toString(myArray));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("After processing - " + Arrays.toString(Arrays.stream(myArray).filter(i -> i != number).toArray()));
        System.out.println("End");
    }
}
