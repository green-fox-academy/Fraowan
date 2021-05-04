package com.gfa.expressionandcontrolflow;

public class PrintEven {
  public static void main(String[] args) {
    int n = 0;
    for (int i = 0; i < 500; i++) {
      n++;
      if (n % 2 == 0 && n < 500) {
        System.out.println(n);
      }
    }
  }
  // Create a program that prints all the even numbers between 0 and 500
}
