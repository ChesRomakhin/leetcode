package ru.chesromakhin.leetcode.problems10xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1011Test {

  @Test
  void test0() {
    assertEquals(15, new Problem1011().shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));
  }

  @Test
  void test1() {
    assertEquals(6, new Problem1011().shipWithinDays(new int[]{3,2,2,4,1,4}, 3));
  }

  @Test
  void test2() {
    assertEquals(3, new Problem1011().shipWithinDays(new int[]{1,2,3,1,1}, 4));
  }

}