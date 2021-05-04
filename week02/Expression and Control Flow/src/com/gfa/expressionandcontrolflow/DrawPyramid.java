package com.gfa.expressionandcontrolflow;

import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number to indicate your pyramid's size.");
    int pyramidSize = scanner.nextInt();
    for (int i = 1; i <= pyramidSize; i++) {
      for (int j = 0; j < pyramidSize - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i + (i - 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was
  }
}
