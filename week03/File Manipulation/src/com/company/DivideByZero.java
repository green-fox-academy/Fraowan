package com.company;

import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {

    divide(0);
  }

  public static void divide(int number) {
    try {
      System.out.println(10 / number);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}

  // Create a function that divides number 10
  // by a number that's passed as a parameter and prints the result.
  // It should print "fail" if the parameter is 0
