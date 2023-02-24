package ru.chesromakhin.leetcode.problems5xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem502Test {

  @Test
  void test0() {
    assertEquals(6, new Problem502().findMaximizedCapital(3, 0, new int[]{1,2,3}, new int[]{0,1,2}));
  }

  @Test
  void test1() {
    assertEquals(4, new Problem502().findMaximizedCapital(2, 0, new int[]{1,2,3}, new int[]{0,1,1}));
  }

  @Test
  void test2() {
    assertEquals(0, new Problem502().findMaximizedCapital(2, 0, new int[]{1,2,3}, new int[]{1,2,1}));
  }

  @Test
  void test3() {
    assertEquals(
      0,
      new Problem502().findMaximizedCapital(111, 0, new int[]{1,2,3}, new int[]{1,2,1}));
  }

}