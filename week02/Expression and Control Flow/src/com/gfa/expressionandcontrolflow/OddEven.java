package com.gfa.expressionandcontrolflow;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
    // then prints "Odd" if the number is odd, or "Even" if it is even
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write here a number and I will tell you if it's an odd or even number!");
    int userNumberInput = scanner.nextInt();
    if (userNumberInput % 2 == 0) {
      System.out.println("This is an EVEN number my friend.");
    } else {
      System.out.println("This is an ODD number my friend.");
    }
  }
}
