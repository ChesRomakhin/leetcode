package ru.chesromakhin.leetcode.problems15xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1523Test {

  @Test
  void test1() {
    assertEquals(0, new Problem1523().countOdds(2, 2));
  }

  @Test
  void test2() {
    assertEquals(1, new Problem1523().countOdds(3, 3));
  }

  @Test
  void test3() {
    assertEquals(1, new Problem1523().countOdds(3, 4));
  }

  @Test
  void test4() {
    assertEquals(2, new Problem1523().countOdds(3, 5));
  }

  @Test
  void test5() {
    assertEquals(1, new Problem1523().countOdds(2, 3));
  }

  @Test
  void test6() {
    assertEquals(1, new Problem1523().countOdds(2, 4));
  }

  @Test
  void test7() {
    assertEquals(5, new Problem1523().countOdds(0, 10));
  }

  @Test
  void test8() {
    assertEquals(6, new Problem1523().countOdds(1, 11));
  }

}