package com.gfa.testing.sum;

import java.util.ArrayList;

public class Sum {

  public int sum(ArrayList<Integer> numbers) {
    if (numbers == null) {
      throw new IllegalArgumentException();
    }

    int sum = 0;

    for (Integer i : numbers) {
      sum += i;
    }
    return sum;
  }
}
