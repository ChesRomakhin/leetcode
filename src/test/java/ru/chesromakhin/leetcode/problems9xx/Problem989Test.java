package ru.chesromakhin.leetcode.problems9xx;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem989Test {

  @Test
  void test1() {
    assertEquals(List.of(1,2,3,4), new Problem989().addToArrayForm(new int[]{1,2,0, 0}, 34));
  }

  @Test
  void test2() {
    assertEquals(List.of(1,2,3,4), new Problem989().addToArrayForm(new int[]{3,4}, 1200));
  }

  @Test
  void test3() {
    assertEquals(List.of(0), new Problem989().addToArrayForm(new int[]{0}, 0));
  }

  @Test
  void test4() {
    assertEquals(List.of(4), new Problem989().addToArrayForm(new int[]{2}, 2));
  }

}