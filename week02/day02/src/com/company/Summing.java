package com.company;

public class Summing {
  public static void main(String[] args) {
    int try1 = 10;
    System.out.println(sum(try1));
  }

  private static int sum(int givenParam) {
    int sumOfNumbers = 0;
    for (int i = 0; i <= givenParam; i++) {
      sumOfNumbers += i;
    }
    return sumOfNumbers;
  }
  // Create the usual class wrapper and main method on your own

  // Write a function called `sum()` that returns the sum of numbers from zero to the given
  // parameter
}
