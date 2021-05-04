package com.gfa.testing.apples.testing;

import com.gfa.testing.apples.Apples;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {
  private Apples apple;

  @BeforeEach
  public void setupEach() {
    apple = new Apples();
  }

  @Test
  public void testGetApple() {
    String expected = "alma";
    String actual = apple.getApple();
    assertEquals(expected, actual);
  }
}
