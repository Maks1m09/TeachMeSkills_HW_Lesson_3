package com.teachmeskills.homework_3.homework3;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Start");
        double[] myArray1 = {1, 123, 3, 4, 123, 1231, 4, 6786};
        double[] myArray2 = {1, 2, 5, 9, 199, 156, 4, 5, 10};
        double average1;
        double counter1 = 0;
        double sum1 = 0;
        double counter2 = 0;
        double sum2 = 0;
        double average2;
        for (int i = 0; i < myArray1.length; i++) {
            counter1++;
            sum1 += myArray1[i];
        }
        for (int i = 0; i < myArray2.length; i++) {
            counter2++;
            sum2 += myArray2[i];
        }
        average1 = sum1 / counter1;
        System.out.println("average1 = " + average1);
        average2 = sum2 / counter2;
        System.out.println("average2 = " + average2);
        if (average1 == average2) {
            System.out.println("arithmetic mean equal");
        } else if (average1 > average2) {
            System.out.println("the arithmetic mean of the first array is greater");
        } else {
            System.out.println("the arithmetic mean of the second array is greater");
        }
        System.out.println("End");
    }
}
