package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem43Test {

  @Test
  void test1() {
    assertEquals("121", new Problem43().multiply("11", "11"));
  }

  @Test
  void test2() {
    assertEquals("6", new Problem43().multiply("2", "3"));
  }

  @Test
  void test3() {
    assertEquals("9801", new Problem43().multiply("99", "99"));
  }

  @Test
  void test4() {
    assertEquals("0", new Problem43().multiply("0", "99"));
  }

  @Test
  void test5() {
    assertEquals("9899999901", new Problem43().multiply("99999999", "99"));
  }

  @Test
  void test6() {
    assertEquals("56088", new Problem43().multiply("123", "456"));
  }

}