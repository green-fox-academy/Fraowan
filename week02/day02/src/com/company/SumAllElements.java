package com.company;

public class SumAllElements {
  // - Create an array variable named `numbers`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Print the sum of the elements of `numbers`
  public static void main(String[] args) {
    int sum = 0;
    int[] numbers = new int[] {3, 4, 5, 6, 7};
    for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
    }
    System.out.println(sum);
  }
}
