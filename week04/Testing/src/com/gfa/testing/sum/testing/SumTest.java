package com.gfa.testing.sum.testing;

import com.gfa.testing.sum.Sum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

  private Sum sum;

  @BeforeEach
  public void setupEach() {
    sum = new Sum();
  }

  @Test
  public void testSumNumbers() {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4));
    Integer expected = 9;
    Integer actual = sum.sum(numbers);
    assertEquals(expected, actual);
  }
}
