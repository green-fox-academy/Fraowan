package com.gfa.expressionandcontrolflow;

import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write here the first number:");
    int firstUserNumberInput = scanner.nextInt();
    System.out.println("Write here the second number:");
    int secondUserNumberInput = scanner.nextInt();
    if (firstUserNumberInput > secondUserNumberInput) {
      System.out.println(firstUserNumberInput);
    } else {
      System.out.println(secondUserNumberInput);
    }
  }
}
