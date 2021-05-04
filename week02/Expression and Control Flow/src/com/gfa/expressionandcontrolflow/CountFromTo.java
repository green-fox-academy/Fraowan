package com.gfa.expressionandcontrolflow;

import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please provide the 1st number:");
    int firstNumberInput = scanner.nextInt();
    System.out.println("Please provide the 2nd number:");
    int secondNumberInput = scanner.nextInt();
    int inputDifference = secondNumberInput - firstNumberInput;
    if (secondNumberInput <= firstNumberInput) {
      System.out.println("The second number should be bigger.");
    } else {
      for (int i = 0; i < inputDifference; i++) {
        System.out.println(firstNumberInput);
        firstNumberInput++;
      }
    }
  }

  // Create a program that asks for two numbers
  // If the second number is not bigger than the first one it should print:
  // "The second number should be bigger"
  //
  // If it is bigger it should count from the first number to the second by one
  //
  // example:
  //
  // first number: 3, second number: 6, should print:
  //
  // 3
  // 4
  // 5
}
