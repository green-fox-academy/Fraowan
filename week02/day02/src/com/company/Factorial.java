package com.company;

public class Factorial {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(calculateFactorial(x));
  }

  private static int calculateFactorial(int numberInput) {
    if (numberInput == 0) {
      return 1;
    } else {
      return (numberInput * calculateFactorial(numberInput - 1));
    }
  }
  //  Create the usual class wrapper and main method on your own

  // - Create a function called `calculateFactorial()`
  //   that returns the factorial of its input
}
