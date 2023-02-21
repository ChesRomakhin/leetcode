package ru.chesromakhin.leetcode.problems5xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem540Test {

  @Test
  void test0() {
    assertEquals(2, new Problem540().singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
  }

  @Test
  void test1() {
    assertEquals(10, new Problem540().singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
  }

  @Test
  void test2() {
    assertEquals(1, new Problem540().singleNonDuplicate(new int[]{1,2,2}));
  }

  @Test
  void test3() {
    assertEquals(3, new Problem540().singleNonDuplicate(new int[]{2,2,3}));
  }

  @Test
  void test4() {
    assertEquals(1, new Problem540().singleNonDuplicate(new int[]{1}));
  }

}