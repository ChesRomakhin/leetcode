package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem35Test {

  @Test
  void test0() {
    assertEquals(2, new Problem35().searchInsert(new int[]{1,3,5,6}, 5));
  }

  @Test
  void test1() {
    assertEquals(1, new Problem35().searchInsert(new int[]{1,3,5,6}, 2));
  }

  @Test
  void test2() {
    assertEquals(4, new Problem35().searchInsert(new int[]{1,3,5,6}, 7));
  }

}