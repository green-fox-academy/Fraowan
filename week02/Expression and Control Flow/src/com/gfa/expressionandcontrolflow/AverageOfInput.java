package com.gfa.expressionandcontrolflow;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the 1st integer:");
        int firstInteger = scanner.nextInt();
        System.out.println("Please enter the 2nd integer:");
        int secondInteger = scanner.nextInt();
        System.out.println("Please enter the 3rd integer:");
        int thirdInteger = scanner.nextInt();
        System.out.println("Please enter the 4th integer:");
        int fourthInteger = scanner.nextInt();
        System.out.println("Please enter the 5th integer:");
        int fifthInteger = scanner.nextInt();

        int sumOfIntegers = firstInteger+secondInteger+thirdInteger+fourthInteger+fifthInteger;

        double averageOfIntegers = sumOfIntegers / 5d;

    System.out.println(averageOfIntegers);
    }
}