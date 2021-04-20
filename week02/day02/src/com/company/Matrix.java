package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
  public static void main(String[] args) {
    // - Create a two dimensional array dynamically with the following content.
    //   Note that a two dimensional array is often called matrix if every
    //   internal array has the same length.
    //   Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    //   Its length should depend on a variable
    //
    // - Print this two dimensional array to the output
    int[][] matrix = new int[4][];

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[3].length; row++, column++) {
        matrix[row][column] += 1;
      }
    }

    System.out.println(Arrays.deepToString(matrix));
  }
}
