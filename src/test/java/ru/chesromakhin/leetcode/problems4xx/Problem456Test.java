package ru.chesromakhin.leetcode.problems4xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem456Test {

  @Test
  void find132pattern() {
    boolean result = new Problem456().find132pattern(new int[]{-1, 3, 2, 0});

    assertTrue(result);
  }

  @Test
  void find132pattern2() {
    boolean result = new Problem456().find132pattern(new int[]{1,0,1,-4,-3});

    assertFalse(result);
  }

}