package ru.chesromakhin.leetcode.problems3xx.problem338;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void countBits1() {
    Solution solution = new Solution();
    int[] bits = solution.countBits(5);

    assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, bits);
  }

  @Test
  void countBits2() {
    Solution solution = new Solution();
    int[] bits = solution.countBits(0);

    assertArrayEquals(new int[]{0}, bits);
  }

  @Test
  void countBits3() {
    Solution solution = new Solution();
    int[] bits = solution.countBits(2);

    assertArrayEquals(new int[]{0, 1, 1}, bits);
  }

}