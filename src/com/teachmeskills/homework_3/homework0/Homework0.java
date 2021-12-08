package com.teachmeskills.homework_3.homework0;

import java.util.Scanner;

public class Homework0 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int[] myArray = {2, 3, 4, 12, 34, 2, 445, 4};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number) {
                System.out.println("The entered number was found");
                continue; //можно break, если нужно найти хотя бы один
            } else {
                System.out.println("No entered number");
            }
        }
        System.out.println("End");
    }
}
