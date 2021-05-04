package com.company;

import java.util.Arrays;

public class SwapElements {
  public static void main(String[] args) {
    String[] orders = new String[] {"first", "second", "third"};
    String swap = orders[0];
    orders[0] = orders[2];
    orders[2] = swap;

    System.out.println(Arrays.deepToString(orders));
  }
}
    // - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`
