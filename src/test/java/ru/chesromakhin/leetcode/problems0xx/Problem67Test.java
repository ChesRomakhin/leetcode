package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem67Test {

  @Test
  void test1() {
    assertEquals("100", new Problem67().addBinary("11", "1"));
  }

  @Test
  void test2() {
    assertEquals("10101", new Problem67().addBinary("1010", "1011"));
  }

}