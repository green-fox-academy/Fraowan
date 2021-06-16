package com.gfa.exam.matrixrotate;

import java.util.Arrays;

public class MatrixRotate {

  public static void main(String[] args) {
    int matrixSize = 5;

    int[][] matrix = new int[matrixSize][matrixSize];

    for (int i = 0; i < matrixSize; i++) {
      for (int j = 0; j < matrixSize; j++) {
        matrix[i][j] = i * matrixSize + 1 + j;
      }
    }
    matrix = rotateMatrix(matrix);
    for (int i = 0; i < matrixSize; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }
  }

  public static int[][] rotateMatrix(int[][] matrix) {
    int length = matrix.length;
    int[][] resultMatrix = new int[length][length];
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        resultMatrix[j][i] = matrix[length - 1 - i][j];
      }
    }
    return resultMatrix;
  }
}
