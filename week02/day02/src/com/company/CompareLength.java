package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CompareLength {

  public static void main(String[] args) {
    // - Create an array variable named `firstArrayOfNumbers`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `secondArrayOfNumbers`
    //   with the following content: `[4, 5]`
    // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
    //   elements than `firstArrayOfNumbers`
    // - Otherwise print: "firstArrayOfNumbers is the longer one"
    int[] firstArrayOfNumbers = new int[] {1, 2, 3};

    int[] secondArrayOfNumbers = new int[] {4, 5};

    int firstArrayLength = firstArrayOfNumbers.length;
    int secondArrayLength = secondArrayOfNumbers.length;

    if (secondArrayLength > firstArrayLength) {
      System.out.println("secondArrayOfNumber is longer");
    } else {
      System.out.println("FirstArrayOfNumbers is the longer one");
    }
  }
}
